class Solution{
    
    public void heapify(int[] c, int i,int n){
       if(i>=n) return;
       
       int parent = i;
       int leftChild = 2*i+1;
       int rightChild = 2*i+2;
       
       if(leftChild<n && c[parent]<c[leftChild])
            parent = leftChild;
        if(rightChild<n && c[parent]<c[rightChild])
            parent = rightChild;
            
        if(parent!=i){
            int temp = c[parent];
            c[parent] = c[i];
            c[i] = temp;
            heapify(c,parent, n);
        }
    }
    public int[] mergeHeaps(int[] a, int[] b, int n, int m) {
        
        int[] c = new int[n+m];
        for(int i=0;i<n;i++){
            c[i] = a[i];
        }
        for(int i = 0;i<m;i++){
            c[i+n] = b[i];
        }
        int nonleaf = (m+n)/2-1;
        
        for(int i = nonleaf; i>=0; i--){
            heapify(c,i,m+n);
        }
        return c;
    }
}