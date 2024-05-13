class Solution {
    public int matrixScore(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][0] == 0){
                    toggleRow(i , grid , n , m);
                }
                else if(grid[i][j]==0){
                    toggleCol( j , grid , n , m);
                }
            }
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            String s = "";
            for(int j=0;j<m;j++){
                s = s + grid[i][j];
            }
            ans += Integer.parseInt(s , 2);
        }
        return ans;
    }
    public void toggleRow(int i , int[][] grid , int n , int m){
        for(int j=0;j<m;j++){
            if(grid[i][j]==0) grid[i][j] = 1;
            else grid[i][j] = 0;
        }
    }
    public void toggleCol(int j , int[][] grid , int n , int m){
        int countZ = 0;
        int countO = 0;
        for(int i=0;i<n;i++){
            if(grid[i][j]==0) countZ++;
            else countO++;
        }
        if(countZ > countO){
            for(int i=0;i<n;i++){
                if(grid[i][j]==0) grid[i][j]=1;
                else grid[i][j]=0;
            }
        }
    }

}