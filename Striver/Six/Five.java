public class Five {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow==fast) return startingIndex(slow,head);
        }
        return null;
    }
    public ListNode startingIndex(ListNode slow ,ListNode head){
        ListNode temp = head;
        while(slow!=temp){
            slow = slow.next;
            temp = temp.next;
        }
        return slow;
    }
}