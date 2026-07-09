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
    int counter=0;
    int ans=0;
    public int kthSmallest(TreeNode root, int k) {
        // Use the inorder ,which gives the node values in acsending order 
        // Maintain the counter ,if that counter is same as k store it 
        // return that counter 
        // T:O(n)
        // S:O(n) for the Stack used in recursion 
        inOrder(root,k);
        return ans;

    }
    private void inOrder(TreeNode root,int k){
        if(root==null)return;
        inOrder(root.left,k);
        counter++;
        if(counter==k)ans=root.val;
        inOrder(root.right,k);
    }
}
