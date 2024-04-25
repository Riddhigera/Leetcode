class Solution {
    public int longestIdealString(String s, int k) {
        int n = s.length();
        int[] temp = new int[26];
        int ans = 0;
        for(int i=0;i<n;i++){
            int idx = s.charAt(i) - 'a';
            int right = Math.min(25 , idx + k);
            int left = Math.max(0 , idx - k) ;
            int max =0;
            for(int j=left;j<=right;j++){
                max = Math.max(temp[j] , max);
            }
            temp[idx] = max+1;
            ans = Math.max(ans , temp[idx]);
        }   
        // int ans = 0;
        // for(int i=0;i<26;i++) ans = Math.max(ans , temp[i]);
        return ans;
    }
}