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
    boolean isSame(TreeNode p,TreeNode q){
        if(p==null &&q==null)return true;
        else if(p==null || q==null)return false;
        return p.val==q.val && isSame(p.left,q.left) && isSame(p.right,q.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode cur=q.poll();
            if(cur.val==subRoot.val){
                if(isSame(cur,subRoot))return true;
            }
            if(cur.left!=null)q.add(cur.left);
            if(cur.right!=null)q.add(cur.right);
        }
        return false;
    }
}
