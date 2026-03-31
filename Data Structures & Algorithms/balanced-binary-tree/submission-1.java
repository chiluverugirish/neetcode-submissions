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
    int dfs(TreeNode r){
        if(r==null)return 0;
        int l=dfs(r.left);
        int ri=dfs(r.right);
        if(l==-1||ri==-1)return -1;
        if((l-ri)>1||(l-ri)<-1)return -1;
        return Math.max(l,ri)+1;
    }
    public boolean isBalanced(TreeNode root) {
        int ans=dfs(root);
        return ans!=-1?true:false;
    }
}
