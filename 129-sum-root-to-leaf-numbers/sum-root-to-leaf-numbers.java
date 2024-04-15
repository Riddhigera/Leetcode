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
    public int sumNumbers(TreeNode root) {
        List<String> arr = new ArrayList<>();
        helper(root , arr , "");
        // System.out.println(arr);
        int ans = 0;
        for(int i=0;i<arr.size();i++){
            ans += Integer.parseInt(arr.get(i));
        }
        return ans;   
    }

    public void helper(TreeNode root , List<String> arr , String s){
        if(root==null) return;

        if(root.left==null && root.right==null){
            s += root.val;
            arr.add(s);
            return;
        }
        helper(root.left , arr , s + root.val );
        helper(root.right , arr , s + root.val );
    }
}