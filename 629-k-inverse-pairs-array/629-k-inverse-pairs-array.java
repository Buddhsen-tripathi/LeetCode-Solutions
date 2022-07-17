class Solution {
    public int kInversePairs(int n, int k) {
       long mod = (long)1e9+7;
        long dp[] = new long[k+1];
        
        for(int curr_n=0;curr_n<=n;curr_n++){
            long nextDp[] = new long[k+1];
            
            for(int curr_k=0;curr_k<=k;curr_k++){
                if(curr_n==0||curr_k>(curr_n*(curr_n-1)/2)) continue;
                else if(curr_k==0||curr_k==(curr_n*(curr_n-1)/2)) nextDp[curr_k] = 1;
                else{
                    long ans = ((nextDp[curr_k-1]%mod)+(dp[curr_k]%mod))%mod;
                    if(curr_k>=curr_n) ans = ((ans%mod)-(dp[curr_k-curr_n]%mod))%mod;
                    
                    nextDp[curr_k] = ans;
                }
            }
            
            dp = nextDp;
        }
        
        long ans = dp[k];
        int finalAns = (int)(ans%mod);
        if(finalAns<0) finalAns+=(int)mod;
        return finalAns;   
    }
}