class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp, -1);
        int ans=recursion(n , dp);
        return ans;
    }
    public int recursion(int n,int[] dp){
        if(n==1 || n==0){

            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        
        return dp[n]=recursion(n-1,dp)+recursion(n-2,dp);
        
    }
}