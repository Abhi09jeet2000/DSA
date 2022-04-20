class One {
    public ListNode reverseList(ListNode head) {
        ListNode current = head, prev = null, next1;
        while(current!=null){
            next1 = current.next;
            current.next = prev;
            prev = current;
            current = next1;
        }
        head = prev;
        return head;
    }
}