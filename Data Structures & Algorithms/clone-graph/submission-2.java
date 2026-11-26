/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    Node dfs(Node n,Map<Node,Node>mp){
        if(n==null)return null;
        if(mp.containsKey(n))return mp.get(n);
        Node st=new Node(n.val);
        mp.put(n,st);
        // st.neighbors=new ArrayList(n.neighbors);
        for(Node c:n.neighbors){
            Node child=dfs(c,mp);
            st.neighbors.add(child);
        }
        return st;
    }
    public Node cloneGraph(Node node) {
        Map<Node,Node>mp=new HashMap<>();
        return dfs(node,mp);
    }
}