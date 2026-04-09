class Solution {
    int dp[];
    int rec(int i,int n){
        
        if(dp[i]!=0)return dp[i];
        dp[i+1]=rec(i+1,n);
        return dp[i+2]=rec(i+2,n);
    }
    public int climbStairs(int n) {
        if(n<=2)return n;
        dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;//rec(0,n);
        for(int i=3;i<=n;i++)dp[i]=dp[i-1]+dp[i-2];
        return dp[n];
    }
}
