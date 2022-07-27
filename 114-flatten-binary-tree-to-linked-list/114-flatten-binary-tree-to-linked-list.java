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
   
    static Queue<Integer> q;
    
    public void flatten(TreeNode root) {
        
        if(root == null)
            return;
        
        q = new LinkedList<>();
        preorder(root);
        
        q.remove();
        
        while(!q.isEmpty()){
            TreeNode temp = new TreeNode(q.poll());
            root.left = null;
            root.right = temp;
            root = root.right;
        }
        
    }
    
    public void preorder(TreeNode root){
        if(root == null)
            return;
        q.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
}