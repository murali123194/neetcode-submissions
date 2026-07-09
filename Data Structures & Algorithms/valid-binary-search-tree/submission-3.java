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
    
    public boolean isValidBST(TreeNode root) {
        /**
        Approach :

        // Maintain the range for every node ,
        // If that node value does not inlcude in that range ,return false;
        // If it moves left : the child should be less than current node ,
        // so make the max to the current node value 
        // For the right children ,the current should be minimum that makes the right children values 
        // should not be less tan the current node 
        // T : O(n) visiting every node
        // S : o(n) for the recursion 


        */
        return BST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);

        





    }

    private boolean BST(TreeNode root,int min,int max){
        if(root==null)return true;

        if(root.val<=min || root.val>=max)return false;


        return BST(root.left,min,root.val)&&BST(root.right,root.val,max);
    }
}
