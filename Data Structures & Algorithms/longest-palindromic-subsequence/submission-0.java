class Solution {
    static int lcs(int i,int j,String s,String rev,int [][]dp){
        if(i==s.length()||j==rev.length())return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s.charAt(i)==rev.charAt(j)){
            dp[i][j]=1+lcs(i+1,j+1,s,rev,dp);
            return dp[i][j];
        }
        dp[i][j]=Math.max(lcs(i,j+1,s,rev,dp),lcs(i+1,j,s,rev,dp));
        return dp[i][j];
    }
    public int longestPalindromeSubseq(String s) {
        StringBuilder sb=new StringBuilder(s);
        String rev=sb.reverse().toString();
        int dp[][]=new int[s.length()][s.length()];
        for(int i=0;i<s.length();i++)Arrays.fill(dp[i],-1);
        return lcs(0,0,s,rev,dp);    
    }
}