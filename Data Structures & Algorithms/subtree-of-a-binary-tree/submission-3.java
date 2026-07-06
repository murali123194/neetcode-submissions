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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        // Find the node with the starting value of the subtree Root
        Queue<TreeNode> q=new LinkedList<>();
        boolean ans=false;
        q.add(root);
        while(!q.isEmpty()){
            TreeNode temp=q.poll();
            if(temp.val==subRoot.val){
                ans= dfs(temp,subRoot);
                if(ans)return true;
            }
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null)q.add(temp.right);
        }
        return false;

    }
    private boolean dfs(TreeNode p,TreeNode q){
        if(p==null&&q==null)return true;
        if(p!=null&&q==null)return false;
        if(p==null&&q!=null)return false;
        if(p.val!=q.val)return false;
        return true&&dfs(p.left,q.left)&&dfs(p.right,q.right);
    }
}
