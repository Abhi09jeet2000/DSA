class Four{
    public int findDuplicate(int[] nums) {
        // Set<Integer> set = new HashSet<>();
        // for(int i : nums){
        //     if(set.contains(i)){
        //         return i;
        //     }
        //     set.add(i);
        // }
        // return 0;
        int slow = nums[0];
        int fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow!=fast);
        
        fast = nums[0];
        while(fast!=slow){
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;
    }
}