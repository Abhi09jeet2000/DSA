class Four {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode l = head, r = head;
        while(n-->0){
            r = r.next;
        }
        if(r==null){
            head = head.next;
        }else{
            while(r.next!=null){
                r = r.next;
                l = l.next; 
            }
            l.next = l.next.next;
        }
        return head;
    }
}