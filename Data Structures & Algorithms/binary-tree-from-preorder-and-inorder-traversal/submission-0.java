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
    Map<Integer,Integer> map;
    int i=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        /**
        1.Make the inOrder into the Map to access easily 
        2.Traverse the preorder and the first element of the tree is always the first 
        element in the preOrder 
        3.Find the index of the element in the inOrder and make the left elements ad the left Sub Tree 
        and the right as the right sub Tree
        4.Maintain the range (l,r) for left (0,index ) and for right (index+1,n)
        if(l==r) return null
        
        */
        map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }

        return BT(preorder,0,inorder.length);

        
        
    }
    private TreeNode BT(int[] p,int l,int r){
        if(l==r)return null;
        
        int val=p[i++];
        int idx=map.get(val);
        TreeNode root=new TreeNode(val);
        root.left=BT(p,l,idx);
        root.right=BT(p,idx+1,r);
        return root;


    }
}
