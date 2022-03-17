class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    
    static long sort(long[] arr, long[] temp, int low, int high){
        long count = 0;
        if(low<high){
            int mid = low + (high-low)/2;
            count+=sort(arr, temp, low, mid);
            count+=sort(arr, temp, mid+1,high);
            count+=merge(arr,temp,low, mid, high);
        }
        return count;
    }
    
    static long merge(long[] arr, long[] temp, int low, int mid, int high){
        for(int i = low; i<=high; i++){
            temp[i] = arr[i];
        }
        long count =0;
        int i=low,j=mid+1;
        int k = low;
        while(i<=mid && j<=high){
            if(temp[j]>=temp[i]){
                arr[k++] = temp[i++];
            }else{
                arr[k++] = temp[j++];
                count += (mid+1 - i); 
            }
        }
        while(i<=mid){
            arr[k++] = temp[i++];
        }
        while(j<=high){
            arr[k++] = temp[j++];
        }
        return count;
    }
    
    static long inversionCount(long arr[], long N)
    {
      int low = 0,high = (int)N-1;
      return sort(arr,new long[high+1], low, high);
    }
}