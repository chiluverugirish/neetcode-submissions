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
    TreeNode rec(TreeNode root){
        if(root==null)return null;
        TreeNode l=rec(root.left);
        TreeNode r=rec(root.right);
        if(l!=null&&r!=null){
            TreeNode t=l;
            root.left=root.right;root.right=t;
        }else if(l!=null){root.right=l;root.left=null;}
        else if(r!=null){root.left=r;root.right=null;}
        return root;
    }
    public TreeNode invertTree(TreeNode root) {
        return rec(root);
    }
}
