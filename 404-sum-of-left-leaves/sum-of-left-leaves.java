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
    public int sumOfLeftLeaves(TreeNode root) {
        return solve(root);
        
    }
    public int solve(TreeNode root){
        if(root == null) return 0;
        int left = 0,right = 0;
        if(root.left != null){
            left = solve(root.left);
			// if this left node is leaf then include into ans.
            if(isLeaf(root.left)){
                left+=root.left.val;
            }
        }
        if(root.right != null){
            right = solve(root.right);
        }
        
            return left+right;
    }
    public boolean isLeaf(TreeNode root){
        if(root.left == null && root.right == null) return true;
        return false;
    }
}