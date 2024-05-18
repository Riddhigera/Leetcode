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
    int ans = 0;
    public int distributeCoins(TreeNode root) {
        count(root);
        return ans;
    }
    public int count(TreeNode root){
        if(root==null) return 0;
        int lftCoins = count(root.left);
        int rgtCoins = count(root.right);
        ans+= Math.abs(lftCoins) + Math.abs(rgtCoins);
        return (root.val-1) + lftCoins + rgtCoins;
    }
}