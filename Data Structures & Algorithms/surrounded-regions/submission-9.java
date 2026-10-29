class Solution {
    static void dfs(char [][]grid,char c,int i,int j){
        int m=grid.length,n=grid[0].length;
        if(i<0 || j<0 || i>=m ||j>=n || grid[i][j]!=c)return;
        grid[i][j]='Z';
        dfs(grid,c,i+1,j);
        dfs(grid,c,i-1,j);
        dfs(grid,c,i,j+1);
        dfs(grid,c,i,j-1);
    }
    static void magic(char [][]grid,int i,int j){
        int m=grid.length,n=grid[0].length;
        if(i<0 || j<0 || i>=m ||j>=n || grid[i][j]!='O')return;
        grid[i][j]='X';
        magic(grid,i+1,j);
        magic(grid,i-1,j);
        magic(grid,i,j+1);
        magic(grid,i,j-1);
    }
    public void solve(char[][] board) {
        int m=board.length,n=board[0].length;
        for(int i=0;i<m;i++){
            if(board[i][0]=='O')dfs(board,'O',i,0);
            if(board[i][n-1]=='O')dfs(board,'O',i,n-1);
            }
        
        for(int i=0;i<n;i++){
            if(board[0][i]=='O')dfs(board,'O',0,i);
            if(board[m-1][i]=='O')dfs(board,'O',m-1,i);
        }
        for(int i=0;i<m;i++)for(int j=0;j<n;j++)if(board[i][j]=='O')magic(board,i,j);
         for(int i=0;i<m;i++)for(int j=0;j<n;j++)if(board[i][j]=='Z')board[i][j]='O';
    }
}
