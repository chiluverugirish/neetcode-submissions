class Solution {
    void bfs(List<List<Integer>>adj,boolean[]visited,int start){
        Queue<Integer>q=new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()){
            int cur=q.poll();
            visited[cur]=true;
            for(int nei:adj.get(cur)){
                if(!visited[nei])q.add(nei);
            }
        }System.out.println();
    }
    public int countComponents(int n, int[][] edges) {
        boolean visited[]=new boolean[n];
        int count=0;List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++)adj.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            int left=edges[i][0];
            int right=edges[i][1];
            adj.get(left).add(right);
            adj.get(right).add(left);
        }
        for(int i=0;i<n;i++){
            if(!visited[i]){
                count++;bfs(adj,visited,i);
            }
        }
        
        return count;
    }
}
