class Solution {
    
    static boolean isPossible(int[]arr, int mid, int D){
        int d=1;
        int sum=0;
        for(int i = 0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>mid){
                d++;
                sum=arr[i];
            }
        }
        return d<=D;
    }
    
    static int leastWeightCapacity(int[] arr, int N, int D) {
        
        int max = 0;
        int sum = 0;
        for(int i : arr){
            sum+=i;
            max = Math.max(max,i);
        }
        if(N==D){
            return max;
        }
        int low = max;
        int high = sum;
        int ans=0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(isPossible(arr,mid,D)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}