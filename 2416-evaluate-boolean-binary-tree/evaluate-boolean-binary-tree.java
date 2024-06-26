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
    public boolean evaluateTree(TreeNode root) {

        return recur(root);
    }
    public boolean recur(TreeNode root){
        if(root.left==null || root.right==null){
            if(root.val==0) return false;
            else return true;
        }

        boolean lft = recur(root.left);
        boolean rgt = recur(root.right);

        if(root.val == 2){
            return (lft || rgt); 
        }
        else return (lft && rgt);

    }
}