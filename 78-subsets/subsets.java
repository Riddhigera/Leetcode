class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans  = new ArrayList<>();
        helper(nums,0,ans,new ArrayList<>());
        return ans;
    }
    public void helper(int[] nums,int i,List<List<Integer>> ans,List<Integer> arr){
        if(i>=nums.length){
            ans.add(new ArrayList<>(arr));
            return;
        }
        arr.add(nums[i]);
        helper(nums,i+1,ans,arr);
        arr.remove(arr.size()-1);
        helper(nums,i+1,ans,arr);
    }
}