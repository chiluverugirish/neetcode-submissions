class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m=image.length,n=image[0].length;
        int start=image[sr][sc];
        Queue<int[]>q=new LinkedList<>();
        boolean visited[][]=new boolean[m][n];
        visited[sr][sc]=true;
        q.add(new int[]{sr,sc});
        image[sr][sc]=color;
        int dirs[][]=new int[][]{{-1,0},{1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int[]tmp=q.poll();
            int x=tmp[0],y=tmp[1];
            for(int dir[]:dirs){
                int nx=dir[0]+x,ny=dir[1]+y;
                if(nx>=0&&nx<m && ny>=0 && ny<n && image[nx][ny]==start && !visited[nx][ny]){
                    image[nx][ny]=color;q.add(new int[]{nx,ny});visited[nx][ny]=true;
                }
            }
        }
        return image;
    }
}