class One {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i=-1, j=-1;
        for(int x =0 ; x<nums.length; x++){
            if(map.containsKey(target-nums[x])){
                i = map.get(target-nums[x]);
                j = x;
                break;
            }else{
                map.put(nums[x],x);
            }
        }
        return new int[]{i,j};
    }
}