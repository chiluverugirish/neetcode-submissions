class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int dirs[][]={{-1,0},{0,-1},{1,0},{0,1}};
        Queue<int[]>q=new LinkedList<>();
        int m=image.length,n=image[0].length;
        q.add(new int[]{sr,sc});
        int org=image[sr][sc];
        if(org==color)return image;
        while(!q.isEmpty()){
            int[]cur=q.poll();
            int r=cur[0],c=cur[1];
            image[r][c]=color;
            
            for(int ar[]:dirs){
                int nr=ar[0]+r,nc=ar[1]+c;
                if(nr>=0&&nr<m && nc>=0&&nc<n && image[nr][nc]==org)q.add(new int[]{nr,nc});
            }
        }
        return image;
    }
}