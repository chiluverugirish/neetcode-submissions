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
    TreeNode buildTree(TreeNode t1,TreeNode t2,TreeNode root){
        // if(t1==null&&t2==null)return;
        if(t1==null)return t2;
        if(t2==null)return t1;
        if(t1!=null&&t2!=null){
            root=new TreeNode(t1.val+t2.val);
        }
        root.left=buildTree(t1.left,t2.left,root.left);
        root.right=buildTree(t1.right,t2.right,root.right);
        return root;
    }
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null)return root2;
        else if(root2==null)return root1;
        TreeNode ans=null;
        return buildTree(root1,root2,ans);
        // return ans;
    }
}