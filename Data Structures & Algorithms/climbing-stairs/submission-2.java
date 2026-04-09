class Solution {
    int dp[];
    int rec(int i){
        if(i<=2)return i;
        if(dp[i]!=0)return dp[i];
        dp[i]=rec(i-2)+rec(i-1);
        return dp[i];
    }
    public int climbStairs(int n) {
        if(n<=2)return n;
        dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;rec(n);
        
        return dp[n];
    }
}
