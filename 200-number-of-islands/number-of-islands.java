class Pair{
    int f;
    int s;
    public Pair(int f , int s){
        this.f = f;
        this.s = s;
    }
}
class Solution {
    
    int[] dr = {-1, 0 , 1, 0 };
    int[] dc = {0 , 1 , 0,-1 };
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        int count = 0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]== false && grid[i][j]=='1'){
                    count++;
                    dfs(grid , vis , i ,j);
                }
            }
        }
        return count;
    }
    public void dfs(char[][] grid , boolean[][] vis , int idx , int jdx){
        vis[idx][jdx] = true;
        
        for(int i=0;i<4;i++){
            int row = idx + dr[i];
            int col = jdx + dc[i];
            if(row<0 || col<0 || row>=grid.length||col>=grid[0].length) continue;
            
            if(vis[row][col] == false && grid[row][col]=='1'){
                dfs(grid, vis , row , col);
            }
            
        }
    }
}