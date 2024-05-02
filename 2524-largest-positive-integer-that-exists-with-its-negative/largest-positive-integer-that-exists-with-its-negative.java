class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int start=0;
        int end=nums.length-1;
        while(start<end){
            if(-nums[start]==nums[end]){
                return nums[end];
            }
            else if(-nums[start]<nums[end]){
                end--;
            }
            else{
                start++;
            }
        }
        return -1;
    }
}