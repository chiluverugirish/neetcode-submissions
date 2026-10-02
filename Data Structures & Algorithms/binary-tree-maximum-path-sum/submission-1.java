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
    static int max;
    static int dfs(TreeNode root){
        if(root==null)return -1005;
        int lmax=dfs(root.left);
        int rmax=dfs(root.right);
        int mmax=Math.max(lmax+root.val,Math.max(rmax+root.val,root.val));
        max=Math.max(max,Math.max(mmax,lmax+rmax+root.val));
        return mmax;
    }
    public int maxPathSum(TreeNode root) {
        max=-1005;
        dfs(root);
        return max;
    }
}
