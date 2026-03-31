/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer>l;
    void rec(TreeNode r){
        if(r==null)return;
        rec(r.left);rec(r.right);l.add(r.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        l=new ArrayList<>();
        rec(root);
        return l;
    }
}