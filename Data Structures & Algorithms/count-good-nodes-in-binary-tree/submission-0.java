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
    public int goodNodes(TreeNode root) {
        int count=preOrder(root,root.val);
        return count;
        
    }
    public int preOrder(TreeNode root,int maxValue){
        if(root==null)return 0;
        int res=root.val>=maxValue?1:0;
        maxValue=Math.max(maxValue,root.val);
        res+=preOrder(root.left,maxValue);
        res+=preOrder(root.right,maxValue);
        return res;
    }
}
