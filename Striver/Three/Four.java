class Four{
    public List<Integer> majorityElement(int[] nums) {
        int val1 = Integer.MIN_VALUE, val2 = Integer.MIN_VALUE, c1 = 0, c2 = 0, len = nums.length;
        for(int i : nums){
            if(i==val1){
                c1++;
            }else if(i == val2){
                c2++;
            }else if(c1==0){
                val1 = i;
                c1 = 1;
            }else if(c2 == 0){
                val2 = i;
                c2 = 1;
            }else{
                c1--;
                c2--;
            }
        }
        c1=0;c2=0;
        for(int i : nums){
            if(i==val1) c1++;
            if(i==val2) c2++;
        }
        List<Integer> list = new ArrayList<>();
        if(c1>Math.floor(len/3)) list.add(val1);
        if(c2>Math.floor(len/3)) list.add(val2);
        
        return list;
        
    }
}