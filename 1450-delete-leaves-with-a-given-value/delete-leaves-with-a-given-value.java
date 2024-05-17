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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        return recur(root , target);
    }
    public TreeNode recur(TreeNode root , int tar){
        if(root==null) return null;
        if(root.val == tar && (root.left==null && root.right==null)){
            return null;
        }
        root.left = recur(root.left , tar);
        root.right = recur(root.right , tar);
        if(root.val == tar && (root.left==null && root.right==null)){
            return null;
        }
        return root;
    }
}