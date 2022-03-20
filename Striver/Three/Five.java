class Five {
    public int uniquePaths(int m, int n) {
        int r = Math.min(m,n);
        if(m <=2 && n<=2) return r;
        int ans=1;
        long a = 1;
        int t= m+n-2;
        for(int i = 0; i<r-1; i++){
            a*=(t-i);
            a=a/(i+1);
        }
        ans = (int)a;
        return ans;
    }
}