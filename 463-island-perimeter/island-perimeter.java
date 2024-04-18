class Solution {
    int count =0;
    int[] dr = {-1, 0 , 1, 0};
    int[] dc = {0 , 1 , 0 , -1};
    public int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1 && !vis[i][j]){
                    helper(grid , vis , i ,j);
                }
            }
        }
        return count;
    }
    public void helper(int[][] grid , boolean[][] vis , int idx , int jdx){
        vis[idx][jdx] = true;

        for(int i=0;i<4;i++){
            int cr = idx + dr[i];
            int cc = jdx + dc[i];
            
            if(cr < 0 || cc < 0 || cr >= grid.length || cc >= grid[0].length) count++;

            else {
                if(grid[cr][cc] == 0) count++;

                else if(!vis[cr][cc]){
                    helper(grid , vis , cr ,cc);
                }
            }
        }
    }
}