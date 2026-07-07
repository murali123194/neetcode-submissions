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

    public List<List<Integer>> levelOrder(TreeNode root) {
        // Use the Queue 
        // Maintain the global list to collect the answers ;
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> ans=new LinkedList<>();
        if(root==null)return ans;
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> level=new ArrayList<>();
            while(size>0){
                TreeNode node=q.poll();
                level.add(node.val);
                if(node.left!=null){
                    q.add(node.left);
                } 
                if(node.right!=null){
                    q.add(node.right);
                }
                size--;
            }
            ans.add(level);
            
        }
        return ans;

        
    }
}
