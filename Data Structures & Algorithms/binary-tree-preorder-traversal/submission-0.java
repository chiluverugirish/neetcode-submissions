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
    List<Integer> pre(TreeNode r,List<Integer>l){
        if(r==null)return new ArrayList<>();
        l.add(r.val);
        pre(r.left,l);
        pre(r.right,l);
        return l;
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        return pre(root,new ArrayList<>());
    }
}