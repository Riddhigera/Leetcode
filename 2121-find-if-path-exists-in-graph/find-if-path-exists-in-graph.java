class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());

        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        boolean[] vis = new boolean[n];
        return dfs(adj, vis , source , destination);
    }
    public boolean dfs(List<List<Integer>> adj , boolean[] vis,int s , int d){
        if(s == d) return true;

        vis[s] = true;

        for(var it:adj.get(s)){
            if(!vis[it] && dfs(adj,vis , it , d)==true) return true;
        }
        return false;
    }
}