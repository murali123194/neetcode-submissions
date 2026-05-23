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
        // if(root==null){
        //     return true;
        // }
        // if(root.val==subRoot.val){
        //      boolean left=dfs(root.left,subRoot);
        //      if(left)return true;
        //      boolean right=dfs(root.right,subRoot);
        //      if(right)return true;
        // }
        // boolean r_left=isSubtree(root.left,subRoot);
        // boolean r_right=isSubtree(root.right,subRoot);
        // return r_left&&r_right;\
        TreeNode curr=root;
        boolean left;
        while(curr!=null){
            left=dfs(curr,subRoot);
            if(left)return true;
            curr=curr.left; 
        }
         curr=root;
        boolean right;
        while(curr.right!=null){
            right=dfs(curr,subRoot);
            if(right)return true;
            curr=curr.right;
        }
        return false;


    }
    
    public boolean dfs(TreeNode p,TreeNode q){
        if(p==null){
            if(q==null)return true;
            return false;

        }
        if(q==null){
            if(p==null)return true;
            return false;

        }
        if(p.val!=q.val)return false;
        boolean left=dfs(p.left,q.left);
        boolean right=dfs(p.right,q.right);
        return left&&right;

    }
}
