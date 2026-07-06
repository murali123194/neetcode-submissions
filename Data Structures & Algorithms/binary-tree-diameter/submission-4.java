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
    int ans=0;
    public int diameterOfBinaryTree(TreeNode root) {
        // (left height ,right height +1)
        // For each node leftHeight + rightHeight;
        int l= height(root);
        return ans;



        
        
        
    }
    private int height(TreeNode root){
        if(root==null)return 0;
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        ans=Math.max(ans,leftHeight+rightHeight);
        return (Math.max(leftHeight,rightHeight)+1);
    }
}
