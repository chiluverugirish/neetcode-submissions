class Solution {
    static int[][]dirs=new int[][]{{-1,0},{1,0},{0,1},{0,-1}};
    static int m,n;
    static void dfs(int i,int j,char[][] grid,boolean visited[][]){
        if(i<0||i>=m||j<0||j>=n||visited[i][j]||grid[i][j]=='X')return;
        grid[i][j]='#';
        visited[i][j]=true;
        for(int dir[]:dirs){
            int nx=i+dir[0],ny=dir[1]+j;
            dfs(nx,ny,grid,visited);
        }
    }
    public void solve(char[][] grid) {
        m=grid.length;n=grid[0].length;
        boolean visited[][]=new boolean[m][n];
        for(int i=0;i<m;i++)if(grid[i][0]=='O')dfs(i,0,grid,visited);
        for(int i=0;i<m;i++)if(grid[i][n-1]=='O')dfs(i,n-1,grid,visited);
        for(int i=0;i<n;i++)if(grid[0][i]=='O')dfs(0,i,grid,visited);
        for(int i=0;i<n;i++)if(grid[m-1][i]=='O')dfs(m-1,i,grid,visited);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='O')grid[i][j]='X';
                if(grid[i][j]=='#')grid[i][j]='O';
            }
        }
    }
}
