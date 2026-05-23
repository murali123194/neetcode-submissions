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
    // Find the Inorder and 
    // Traverse the Inorder and check whether it is in Ascending order or not 
    List<Integer> inorder=new LinkedList<>();
    inOrder(root,inorder);
    for(int i=1;i<inorder.size();i++){
        if(inorder.get(i-1)>=inorder.get(i))return false;
    }
    return true;

        
    }
    private void inOrder(TreeNode root,List<Integer> inorder){
        if(root==null)return;
        inOrder(root.left,inorder);
        inorder.add(root.val);
        inOrder(root.right,inorder);
    }
}
