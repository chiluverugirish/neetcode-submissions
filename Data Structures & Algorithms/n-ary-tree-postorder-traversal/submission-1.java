/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    static List<Integer>ans;
    void post(Node root){
        if(root==null)return;
        List<Node>c=root.children;
        for(Node r:c){
            post(r);
        }
        ans.add(root.val);
    }
    public List<Integer> postorder(Node root) {
        ans=new ArrayList<>();
        post(root);
        return ans;
    }
}