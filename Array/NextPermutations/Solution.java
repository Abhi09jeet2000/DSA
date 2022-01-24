class Solution{
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j] = temp;
    }
    static List<Integer> nextPermutation(int N, int arr[]){
        List<Integer> l = new ArrayList<>();
        // if(arr.length<=1 || arr==null) return Arrays.asList(arr);
        int i = arr.length-2;
        while(i>=0 && arr[i]>=arr[i+1]) i--;
        if(i>=0){
            int j = arr.length-1;
            while(arr[i]>=arr[j]) j--;
            swap(arr,i,j);
        }
        
        for(int k = 0 ; k<=i; k++) l.add(arr[k]);
        for(int k = N-1; k>i;k--) l.add(arr[k]);
        
        return l;
    }
}