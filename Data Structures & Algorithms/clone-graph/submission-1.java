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
    public Node cloneGraph(Node node) {
        if(node==null)return null;
        Queue<Node>q=new LinkedList<>();
        q.add(node);
        Node root=new Node(node.val);
        Map<Node,Node>mp=new HashMap<>();
        mp.put(node,root);
        while(!q.isEmpty()){
            Node cur=q.poll();
            List<Node>nei=cur.neighbors;
            // System.out.println(cur.val);
            for(Node i:nei){
                if(!mp.containsKey(i)){
                    q.add(i);
                    mp.put(i,new Node(i.val));
                }
                mp.get(cur).neighbors.add(mp.get(i));
            }
        }
        return root;
    }
}