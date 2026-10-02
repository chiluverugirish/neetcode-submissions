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
    static TreeNode LCA(TreeNode p,TreeNode root,TreeNode q){
        if(p.val > root.val && q.val >root.val)return LCA(p,root.right,q);
        else if(p.val <root.val && q.val<root.val)return LCA(p,root.left,q);
        return root;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return LCA(p,root,q);
    }
}
