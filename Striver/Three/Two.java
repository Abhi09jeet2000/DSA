class Two {
    public double myPow(double x, int n) {
        double ans = 1.0;
        long nn = n;
        if(nn<0) nn*=-1;
        while(nn>0){
            if(nn%2!=0){
                ans*=x;
                // System.out.println(ans);
                nn--;
            }else{
                x*=x;
                nn/=2;
            }
        }
        
        if(n<0){
            ans = 1.0/ans;
        }
        return ans;
        
    }
}