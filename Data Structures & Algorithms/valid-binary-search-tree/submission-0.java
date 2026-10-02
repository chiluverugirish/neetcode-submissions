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
    boolean dfs(int left,TreeNode root,int right){
        if(root==null)return true;
        if(left>=root.val || right<=root.val)return false;
        return dfs(left,root.left,root.val) && dfs(root.val,root.right,right);
    }
    public boolean isValidBST(TreeNode root) {
        return dfs(Integer.MIN_VALUE,root,Integer.MAX_VALUE);
    }
}
