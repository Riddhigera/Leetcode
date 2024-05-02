class Solution {
    public boolean canJump(int[] nums) {
        int finalpositions=nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i]>=finalpositions){
                finalpositions=i;
            }
        }
        return finalpositions==0;
    }
}