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
    
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(root==null){
            return null;
        }
        if(depth==1){
            TreeNode nn=new TreeNode(val);
            nn.left=root;
            return nn;
        }
        root=solver(root,val,depth,1);
        return root;
    }
    
    public TreeNode solver(TreeNode root, int val, int depth, int height){
        if(root==null){
            return root;
        }

        if(height==depth-1){
            TreeNode l=new TreeNode(val);
            TreeNode r=new TreeNode(val);
            
            l.left=solver(root.left,val,depth,height+1);
            r.right=solver(root.right,val,depth,height+1);
            root.left=l;
            root.right=r;
            return root;
        }
        root.left=solver(root.left,val,depth,height+1);
        root.right=solver(root.right,val,depth,height+1);
        return root;
    }
}