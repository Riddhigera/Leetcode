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
        if(depth==1){
            TreeNode f = new TreeNode(val);
            f.left = root;
            return f;
        }
        helper(root , val , depth , 1);
        return root;
    }
    public void helper(TreeNode root , int val ,int depth , int i){
        if(root==null) return;

        if(i+1==depth){
            TreeNode f1 = new TreeNode(val);
            TreeNode f2 = new TreeNode(val);
            f1.left = root.left;
            f2.right = root.right;

            root.left = f1;
            root.right = f2;
            return;
        }
        helper(root.left , val , depth , i+1);
        helper(root.right , val , depth , i+1);
    }
}