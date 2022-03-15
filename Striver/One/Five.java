class Five {
    public void sortColors(int[] nums) {
        int zero = 0, one = 0;
        for(int i : nums){
            if(i==0){
                zero++;
            }else if(i==1){
                one++;
            }
        }
        int i = 0;
        while(zero-->0){
            nums[i++] = 0;
        }
        
        while(one-->0){
            nums[i++] = 1;
        }
        
        while(i<nums.length){
            nums[i++] = 2;
        }
    }
}