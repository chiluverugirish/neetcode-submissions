class Solution {
    static int dfs(int x,int y,int[][]grid,int[][]dp){
        if(x<0 || x>=grid.length || y<0 || y>=grid[0].length)return -1;
        if(dp[x][y]!=-2)return dp[x][y];
        if(x==grid.length-1 && y==grid[0].length-1){
            if(grid[x][y]!=1)return 1;else return -1;}
        if(grid[x][y]==1)return -1;
        int bottom=dfs(x+1,y,grid,dp);
        int right=dfs(x,y+1,grid,dp);
        if(bottom!=-1 && right!=-1){dp[x][y]= bottom+right;}
        else if(bottom!=-1)dp[x][y]= bottom;
        else if(right!=-1)dp[x][y]= right;
        else dp[x][y]=-1;
        return dp[x][y];
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length,n=obstacleGrid[0].length;
        int dp[][]=new int [m][n];
        for(int i=0;i<m;i++)Arrays.fill(dp[i],-2);
        int val=dfs(0,0,obstacleGrid,dp);
        return val!=-1 ?val:0;
    }
}