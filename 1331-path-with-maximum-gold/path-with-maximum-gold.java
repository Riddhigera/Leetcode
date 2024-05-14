class Solution {
    int[] dr = {-1 , 0 , 1 , 0};
    int[] dc = {0 , 1 , 0 , -1};
    public int getMaximumGold(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length , max = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] != 0){
                    max = Math.max(max , dfs(grid , i , j , n , m));
                }
            }
        }
        return max;
    }
    public int dfs(int[][] grid , int i  , int j , int row , int col){
        if(i<0 || i>=row || j<0 || j>=col || grid[i][j]==0) return 0;

        int temp = grid[i][j] , max = 0;
        grid[i][j] = 0;

        for(int id=0;id<4;id++){
            int cr = i + dr[id];
            int cc = j + dc[id];
            max = Math.max(max , dfs(grid , cr , cc , row , col));
        }
        grid[i][j] = temp;
        return temp + max;
    }
}