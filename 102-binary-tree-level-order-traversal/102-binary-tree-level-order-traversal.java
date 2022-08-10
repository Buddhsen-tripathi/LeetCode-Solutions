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
        Queue <TreeNode> q = new LinkedList<>();
        List<List<Integer>> al = new ArrayList<>();
        if(root ==null)
            return al;
        ArrayList<Integer> an;
        q.add(root);
        while(!q.isEmpty()){
            an = new ArrayList<Integer>();
            int size = q.size();
            for(int i = 0 ; i < size ; i++){
                TreeNode node = q.poll();
                an.add(node.val);
                if(node.left != null)
                    q.add(node.left);
                if(node.right != null)
                    q.add(node.right);
            }
            al.add(an);
        }
        return al;
    }
}