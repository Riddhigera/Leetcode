class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int count=0;
        int me=nums[0];
        for(int i=0;i<n;i++){
            if (nums[i]==me){
                count+=1;
            }
            else{
                count-=1;
            }
            if(count==0){
                me=nums[i];
                count+=1;
            }
            
        }
        return me;
    }
}