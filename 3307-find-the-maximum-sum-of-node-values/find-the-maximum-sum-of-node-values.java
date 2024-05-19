class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        int n = nums.length;
        long sum = 0;
        Integer[] arr = new Integer[n];

        for(int i=0;i<n;i++){
            arr[i] = (nums[i] ^ k) - nums[i];
            sum+=nums[i];
        }
        Arrays.sort(arr , (a,b)->{
            return b-a;
        });

        for(int i=0;i<n-1;i+=2){
            if(arr[i]+arr[i+1] < 0) return sum;

            sum+=arr[i]+arr[i+1];
        }
        return sum;
    }
}