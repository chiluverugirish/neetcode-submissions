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
    // int height(TreeNode r){
    //     if(r==null)return 0;
    //     int l=height(r.left);
    //     int ri=height(r.right);
    //     return Math.max(l,ri)+1;
    // }
    public int maxDepth(TreeNode root) {
        // return height(root);
        if(root==null)return 0;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        int level=0;
        while(!q.isEmpty()){
            int s=q.size();
            for(int i=0;i<s;i++){
            TreeNode c=q.poll();
            if(c.left!=null)q.add(c.left);
            if(c.right!=null)q.add(c.right);
            }level++;
        }return level;
    }
}
