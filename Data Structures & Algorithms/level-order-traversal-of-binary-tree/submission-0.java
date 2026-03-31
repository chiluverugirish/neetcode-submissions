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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>l=new ArrayList<>();
        if(root==null)return l;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int s=q.size();
            List<Integer>tmp=new ArrayList<>();
            for(int i=0;i<s;i++){
                TreeNode c=q.poll();tmp.add(c.val);
                if(c.left!=null)q.add(c.left);
                if(c.right!=null)q.add(c.right);
            }l.add(tmp);
        }return l;
    }
}
