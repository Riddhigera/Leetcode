class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        int n = nums.length , count=0 , min = Integer.MAX_VALUE;
        long sum = 0;
        for(int i=0;i<n;i++){
            if((nums[i] ^ k) > nums[i]){
                sum+=(nums[i]^k);
                count++;
            }

            else{
                sum+=nums[i];
            }
            min = Math.min(min , Math.abs((nums[i]^k) - nums[i]));
        }
        if(count%2==0) return sum;

        return sum-min;
    }
}