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
    int pre_start=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       return buildTree(preorder,inorder,0,inorder.length-1);
    }
     public TreeNode buildTree(int[] preorder, int[] inorder,int inorder_start,int inorder_end){
       if(inorder_start>inorder_end)
            return null;
        TreeNode temp=new TreeNode(preorder[pre_start++]);
        if(inorder_start==inorder_end)
            return temp;
        int in_index= search(inorder,inorder_start,inorder_end,temp.val);
        temp.left=buildTree(preorder,inorder,inorder_start,in_index-1);
        temp.right=buildTree(preorder,inorder,in_index+1,inorder_end);
        return temp;
    }
    public int search(int[] arr,int start,int end,int no){
    for(int i=start;i<=end;i++)
        if(arr[i]==no)
            return i;
    return -1;
    }
}