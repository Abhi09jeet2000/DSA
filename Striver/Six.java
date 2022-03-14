class Six {
    public int maxProfit(int[] prices) {
     
        int max = 0;
        // int[] sells = new int[prices.length];
        // for(int i = prices.length-1 ; i>=0; i--){
        //     sells[i] = max;
        //     max = (max<prices[i])?prices[i]:max;
        // }
        // max =0;
        // for(int i = 0;i<prices.length-1;i++){
        //     int profit = sells[i] - prices[i];
        //     max = (max<profit)?profit:max;
        // }
        
        int profit = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++){
            if(min>prices[i]){
                min = prices[i];
            }
            profit = prices[i] - min;
            if(max<profit){
                max = profit;
            }
        }
        
        return max;
    }
}