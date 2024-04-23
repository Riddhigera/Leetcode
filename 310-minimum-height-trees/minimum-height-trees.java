class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if(n==0) return new ArrayList<>();
        if(n==1){
            List<Integer> adj = new ArrayList<>();
            adj.add(0);
            return adj;
        }
        List<List<Integer>> adj = new ArrayList<>();
        int[] indeg = new int[n];
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            indeg[u]++;
            indeg[v]++;
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indeg[i]==1)   q.add(i);
        }
        while(n>2){
            int size = q.size();
            n-=size;
            while(size!=0){
                int val = q.remove();
                for(var it:adj.get(val)){
                    indeg[it]--;
                    if(indeg[it]==1) q.add(it);
                }
                size--;
            }
        }
        List<Integer> ans = new ArrayList<>();
        while(!q.isEmpty()){
            ans.add(q.remove());
        }
        return ans;
    }
}