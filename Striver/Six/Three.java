class Three {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1) return head;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode prev = dummy, curr = dummy, nex = dummy;
        int count = 0;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        // System.out.println(count);
        while(count>=k){
            curr = prev.next;
            nex = curr.next;
            for(int i = 1; i<k; i++){
                curr.next = nex.next;
                nex.next = prev.next;
                prev.next = nex;
                nex = curr.next;
            }
            prev = curr;
            count -=k;
        }
        return dummy.next;
    }
}