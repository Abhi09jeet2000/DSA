class Three {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if(list1==null && list2==null) return null;
        if(list1!=null && list2==null) return list1;
        if(list1==null && list2!=null) return list2;
        
        ListNode list = null, temp = null;
        int data;
        
        if(list == null){
            if(list1.val>list2.val){
                data = list2.val;
                list2 = list2.next;
            }else{
                data = list1.val;
                list1 = list1.next;
            }
            list = new ListNode(data);
            temp = list;
        }
        while(list1!=null && list2!=null){
            if(list1.val>list2.val){
                data = list2.val;
                list2 = list2.next;
            }else{
                data = list1.val;
                list1 = list1.next;
            }
            ListNode curr = new ListNode(data);
            temp.next = curr;
            temp = curr;
        }
        while(list1!=null){
            data = list1.val;
            list1 = list1.next;
            ListNode curr = new ListNode(data);
            temp.next = curr;
            temp = curr;
        }
        while(list2!=null){
            data = list2.val;
            list2 = list2.next;
            ListNode curr = new ListNode(data);
            temp.next = curr;
            temp = curr;
        }
        return list;
    }
}