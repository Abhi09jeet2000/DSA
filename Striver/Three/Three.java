class Three {
    public int majorityElement(int[] nums) {
        //  Map<Integer, Integer> map  = new HashMap<>();
        // for(int i : nums){
        //     map.put(i,map.getOrDefault(i,0)+1);
        // }
        // for(Map.Entry<Integer,Integer> i : map.entrySet()){
        //     if(i.getValue()>(nums.length/2)) return i.getKey();
        // }
        // return -1;
        int max = 0;
        int candidate = 0;
        
        for(int i : nums){
            if(max==0){
                candidate = i;
            }
            
            if(candidate==i){
                max+=1;
            }else{
                max-=1;
            }
        }
        return candidate;
    }
}