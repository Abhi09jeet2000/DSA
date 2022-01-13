class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Stack<Integer> stack = new Stack<>();
        int t = k;
        while(k-->0){
            stack.push(q.poll());
        }
        k = t;
        t = q.size();
        while(k-->0){
            q.offer(stack.pop());
        }
        while(t-->0){
            q.offer(q.poll());
        }
        
        return q;
    }
}
