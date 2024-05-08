class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        Integer[] ref = new Integer[n];
        for(int i=0;i<n;i++) ref[i] = score[i];
        Arrays.sort(ref , (a,b)->{
            return b-a;
        });
        Map<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<n;i++){
            h.put(ref[i] , i);
        }
        String[] ans = new String[n];
        for(int i=0;i<n;i++){
            int val = score[i];
            if(h.get(val)==0){
                ans[i] = "Gold Medal";
            }
            else if(h.get(val) == 1){
                ans[i] = "Silver Medal";
            }
            else if(h.get(val)== 2){
                ans[i] = "Bronze Medal";
            }
            else{
                ans[i] = String.valueOf(h.get(val)+1);
            }
        }
        return ans;
    }
}