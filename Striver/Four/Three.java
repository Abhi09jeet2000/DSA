class Three {
    public int longestConsecutive(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }
        // TreeMap<Integer,Integer>  map = new TreeMap<>();
        // for(int i = 0 ; i<nums.length; i++){
        //     map.put(nums[i], i);
        // }
        // // System.out.println(map); 
        // int count = 0, max = 0;
        // int prev = map.get(map.keySet().toArray()[0]);
        // for(Map.Entry<Integer, Integer> m : map.entrySet()){
        //     int curr = m.getKey();
        //     if(curr==(prev+1)){
        //         count += 1;
        //     }else{
        //         count = 1;
        //     }
        //     prev = curr;
        //     max = (max>count)?max:count;
        // }
        // return max;
        
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int lc = 0;
        for(int i : nums){
            if(!set.contains(i-1)){
                int longestSeq = 1;
                int num = i;
                while(set.contains(num+1)){
                    longestSeq+=1;
                    num+=1;
                }
                lc = Math.max(lc,longestSeq);
            }
        }
        return lc;
    }
}