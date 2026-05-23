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
    public int kthSmallest(TreeNode root, int k) {
        int[] ans=new int[1];
        int[] count=new int[1];
        inOrder(root,ans,k,count);
        return ans[0];

        
        
    }
    public void inOrder(TreeNode root,int[] ans,int k,int[] count){
        if(root==null)return;
        inOrder(root.left,ans,k,count);
        count[0]++;
        if(count[0]==k){ans[0]=root.val;
        return;}
        inOrder(root.right,ans,k,count);
        
        
        
        // inOrder(root.right,ans,k,count);

    }
}
