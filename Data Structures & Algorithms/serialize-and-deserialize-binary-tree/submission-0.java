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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)return "-1";
        StringBuilder sb=new StringBuilder();
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode cur=q.poll();
            if(cur==null){
                sb.append("-1 ");
                continue;
            }
            sb.append(cur.val+" ");
            
            if(cur.left!=null)q.add(cur.left);
            else q.add(null);
            if(cur.right!=null)q.add(cur.right);
            else q.add(null);
        }
        //System.out.println(sb.toString());
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[]st=data.split(" ");
        
        int[]nums=new int[st.length];
        for(int i=0;i<st.length;i++)nums[i]=Integer.parseInt(st[i]);
        Queue<TreeNode>q=new LinkedList<>();
        if(nums[0]==-1)return null;
        TreeNode root=new TreeNode(nums[0]);
        q.add(root);int i=1,n=nums.length;
        while(!q.isEmpty()){
            TreeNode cur=q.poll();
            if(nums[i]!=-1&&i<n){
                TreeNode l=new TreeNode(nums[i]);
                cur.left=l;
                q.add(cur.left);
            }i++;
            if(nums[i]!=-1&&i<n){
                TreeNode r=new TreeNode(nums[i]);
                cur.right=r;
                q.add(cur.right);
            }i++;
        }return root;
        
    }
}
