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
    public String smallestFromLeaf(TreeNode root) {
        List<String> arr = new ArrayList<>();
        helper(root , arr , "");
        Collections.sort(arr);
        return arr.get(0);
    }
    public void helper(TreeNode root , List<String> arr , String s){
        if(root==null) return;

        int v = root.val + 97;
        char ch = (char) v;
        
        if(root.left==null && root.right==null){
            s = ch + s;
            arr.add(s);
            return;
        }

        helper(root.left , arr , ch + s);
        helper(root.right , arr , ch + s);
    }
}