class Solution {
    public int islandPerimeter(int[][] grid) {
        int dirs[][]=new int[][]{{-1,0},{1,0},{0,1},{0,-1}};
        int m=grid.length,n=grid[0].length;
        boolean visited[][]=new boolean[m][n];
        Queue<int[]>q=new LinkedList<>();
        int sum=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    q.add(new int[]{i,j});
                    visited[i][j]=true;
                    while(!q.isEmpty()){
                        int[]tmp=q.poll();
                        int x=tmp[0],y=tmp[1];
                        for(int []dir:dirs){
                            int nx=x+dir[0],ny=y+dir[1];
                            if(nx>=m || ny >=n || nx<0 || ny<0 || grid[nx][ny]==0){sum++;continue;}
                            if(visited[nx][ny])continue;
                            visited[nx][ny]=true;
                            q.add(new int[]{nx,ny});
                        }
                    }
                    return sum;
                }
            }
        }
        return sum;
    }
}