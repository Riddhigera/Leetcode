class Solution {
    public int subsetXORSum(int[] nums) {
        int sum = 0 , n = nums.length;
        List<List<Integer>> subset = new ArrayList<>();
        back(subset , nums , 0 , new ArrayList<>());
        for(var it: subset){
            int xor = 0;
           if(it.size() >= 2){
            for(int i : it){
                xor = xor ^ i;
            }
           }
           else if(it.size()==1){
            for(int i: it){
                sum+=i;
            }
           }
           sum+=xor;
        }
        return sum;
    }
    public void back(List<List<Integer>> subset, int[] nums , int idx , List<Integer> arr){
        if(idx>=nums.length){
            subset.add(new ArrayList<>(arr));
            return;
        }
        arr.add(nums[idx]);
        back(subset , nums , idx+1 , arr);
        arr.remove(arr.size()-1);
        back(subset , nums ,idx+1,arr);
    }
}