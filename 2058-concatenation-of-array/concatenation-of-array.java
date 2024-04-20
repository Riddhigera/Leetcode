class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int length=2*n;
        int ans[]=new int[length];
        for (int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;

        
    }
}