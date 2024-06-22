class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length , ans = 0 , sum=0;
        for(int i=0;i<n;i++){
            if(nums[i] % 2 == 0) nums[i] = 0;
            else nums[i] = 1;
        }

        Map<Integer,Integer> h = new HashMap<>();
        h.put(0,1);

        for(int i=0;i<n;i++){
            sum+=nums[i];

            int diff = sum - k;

            if(h.containsKey(diff)){
                ans+=h.get(diff);
            }
            h.put(sum , h.getOrDefault(sum ,0)+1);
        }
        return ans;

    }
}