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
    public boolean isBalanced(TreeNode root) {
        int[] res=new int[1];
        int x=balance(root,res);
        if(res[0]==-1)return false;
        return true;


        
    }
    public int balance(TreeNode root,int[] res){
        if(root==null){
            return 0;
        }
        int left=balance(root.left,res);
        int right=balance(root.right,res);
        if(Math.abs(left-right)>1){
            res[0]=-1;
        }
        return Math.max(left,right)+1;
    }
}
