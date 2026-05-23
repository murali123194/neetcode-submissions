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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root!=null)
        q.add(root);
        while(!q.isEmpty()){
            int rightEnd=0;
            int size=q.size();
            while(size>=1){
                TreeNode node=q.poll();
                size--;
                rightEnd=node.val;
                if(node.left!=null)q.add(node.left);
                if(node.right!=null)q.add(node.right);

            }
            ans.add(rightEnd);
        }
        return ans;

        
    }
}
