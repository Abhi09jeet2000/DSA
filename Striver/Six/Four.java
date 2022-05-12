class Four {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode current = slow, nex, prev = null; 
        while(current!=null){
            nex = current.next;
            current.next = prev;
            prev = current;
            current = nex;
        }
        current = head;
        while(prev != null){
            if(current.val!=prev.val) return false;
            current = current.next;
            prev = prev.next;
        }
        return true;
    }
}