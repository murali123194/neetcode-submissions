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
    public TreeNode deleteNode(TreeNode root, int key) {
        // Base condn
        // search the node 
        // find the successor and replace that key node
        // c1: leaf node 
        // c2:only one child 
        // c3.two children
        if(root==null)return null;
        if(root.val==key){
            
            if(root.left!=null&&root.right!=null){
                /* Find the min in the right subTree of it */
                TreeNode temp=root.right;
                
                while(temp.left!=null){
                    temp=temp.left;
                }
                temp.left=root.left;
                
                return root.right;
            }
            else if(root.left==null)return root.right;
            else if(root.right==null)return root.left;

        }
        if(key>root.val){
            root.right=deleteNode(root.right,key);
        }else {
            root.left=deleteNode(root.left,key);
        }
        return root;
        
    }
}