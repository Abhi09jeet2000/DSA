class Solution 
{
    public static boolean isPossible(int[]arr, int mid, int M){
        int sum = 0;
        int stud = 1;
        for(int i = 0; i<arr.length; i++){
            sum +=arr[i];
            if(sum>mid){
                sum = arr[i];
                stud++;
            }
        }
        return stud<=M;
    }
    
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        int max = 0;
        int sum = 0;
        for(int val : A){
            sum += val;
            max = Math.max(max,val);
        }
        
        if(N==M){
            return max;
        }
        
        int low = max;
        int high = sum;
        int ans = 0;
        while(low<=high){
            int mid = low + (high-low)/2;
            
            if(isPossible(A,mid,M)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        
        return ans;
    }
}