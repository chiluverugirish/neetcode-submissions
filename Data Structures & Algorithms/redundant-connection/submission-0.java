class Solution {
    static int[]parent;
    static int find(int x){
        if(x!=parent[x])return parent[x]=find(parent[x]);
        return parent[x];
    }
    static boolean union(int x,int y){
        int px=find(x),py=find(y);
        if(px==py)return false;
        parent[px]=parent[py];
        return true;
    }
    public int[] findRedundantConnection(int[][] edges) {
        parent=new int[edges.length];
        for(int i=0;i<edges.length;i++)parent[i]=i;
        for(int []tmp:edges){
            if(!union(tmp[0]-1,tmp[1]-1))return tmp;
        }
        return new int[]{0,0};
    }
}
