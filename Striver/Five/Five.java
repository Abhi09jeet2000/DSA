class Five {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1== null && l2==null) return null;
        if(l1!=null && l2==null) return l1;
        if(l1==null && l2!=null) return l2;
        int sum = 0;
        ListNode head, temp = new ListNode(0);
        head = temp;
        while(l1!=null || l2!=null || sum!=0){
            if(l1!=null){
                sum +=l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2 = l2.next;
            }
            ListNode curr = new ListNode(sum%10);
            temp.next = curr;
            temp = curr;
            sum /=10;
        }
        
        return head.next;
    }
}