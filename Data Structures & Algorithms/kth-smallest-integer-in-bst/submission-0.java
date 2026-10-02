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
    static int ans,k1,i;
    static boolean isdone;
    static void dfs(TreeNode root){
        if(root==null || isdone)return;
        dfs(root.left);
        i++;if(i==k1){ans=root.val;isdone=true;return;}
        dfs(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        ans=0;k1=k;isdone=false;i=0;
        dfs(root);
        return ans;
    }
}
