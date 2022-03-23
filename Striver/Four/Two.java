class Two {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        if (nums == null || nums.length == 0)
            return list;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i<n-3; i++){
            int target3 = target - nums[i];
            for(int j = i+1; j<n-2; j++){
                int left = j+1, right = n-1;
                int target2 = target3-nums[j];
                while(left<right){
                    int two_sum=nums[left]+nums[right];
                    if(target2>two_sum){
                        left++;
                    }else if(target2<two_sum){
                        right--;
                    }else{
                        List<Integer> quad = new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[left]);
                        quad.add(nums[right]);
                        list.add(quad);
                        
                        while(right>left && nums[left]==quad.get(2)) left++;
                        while(right>left && nums[right]==quad.get(3)) right--;
                    }
                }
                while(j<n-1 && nums[j]==nums[j+1]) j++;
            }
            while(i<n-1 && nums[i]==nums[i+1]) i++; 
        }
        return list;
    }
}