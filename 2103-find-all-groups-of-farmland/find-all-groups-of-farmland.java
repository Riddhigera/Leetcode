class Solution {
    int[] dr = {-1, 0 , 1 , 0};
    int[] dc = {0 , 1 , 0 ,-1};
    public int[][] findFarmland(int[][] land) {
        int n = land.length;
        int m = land[0].length;
        List<int[]> ansList = new ArrayList<>();
        boolean[][] vis = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==false && land[i][j]==1){
                    int[] maxC = {i,j};
                    dfs(land , vis , i , j , maxC);
                    ansList.add(new int[]{i , j , maxC[0] , maxC[1]});
                }
            }
        }
        int[][] ans = new int[ansList.size()][4];
        for(int i=0;i<ansList.size();i++){
            ans[i] = ansList.get(i);
        }
        return ans;
    }
    public void dfs(int[][] land , boolean[][] vis , int idx , int jdx , int[] maxC){
        vis[idx][jdx] = true;

        for(int i=0;i<4;i++){
            int row = idx + dr[i];
            int col = jdx + dc[i];

            if(row>=0 && row<land.length && col>=0 && col<land[0].length && land[row][col]==1 && !vis[row][col]){
                maxC[0] = Math.max(maxC[0] , row);
                maxC[1] = Math.max(maxC[1] , col);
                dfs(land , vis , row , col , maxC);
            }
        }
    }
}