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
    static int dfs(TreeNode r){
        if(r==null)return 0;
        return Math.max(dfs(r.left),dfs(r.right))+1;
    }
    public int maxDepth(TreeNode root) {
        return dfs(root);
    }
}
