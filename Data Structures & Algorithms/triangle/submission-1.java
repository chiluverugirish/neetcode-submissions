class Solution {
    int dp[][];
    int dfs(List<List<Integer>> tri,int i,int j){
        if(i>=tri.size())return 0;
        if(dp[i][j]!=Integer.MIN_VALUE)return dp[i][j];
        int a=dfs(tri,i+1,j),b=dfs(tri,i+1,j+1);
        // System.out.println(a+" "+b+" "+i+" "+j);
        dp[i][j]=Math.min(a,b)+tri.get(i).get(j);
        return dp[i][j];
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int m=triangle.size();
        dp=new int[m][m];
        for(int i=0;i<m;i++)Arrays.fill(dp[i],Integer.MIN_VALUE);
        return dfs(triangle,0,0);
    }
}