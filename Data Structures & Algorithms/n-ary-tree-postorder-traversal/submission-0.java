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
    static void rec(Node root){
        if(root==null)return;
        for(Node c:root.children){
            rec(c);
        }
        ans.add(root.val);
    }
    public List<Integer> postorder(Node root) {
        ans=new ArrayList<>();
        rec(root);
        return ans;
    }
}