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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int p1=p.val;
        int p2=q.val;
        boolean flag=true;
        while(flag){
            if(p1<root.val&&p2<root.val)root=root.left;
            else if(p1>root.val&&p2>root.val)root=root.right;
            else{
                flag =false;
            }
        }
        return root;
        
        
    }
}
