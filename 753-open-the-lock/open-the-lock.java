class Solution {
    public void generateNeighbours(Queue<String> q , Set<String> dead , Set<String> vis , String s){
        for(int i=0;i<4;i++){
            StringBuilder sb = new StringBuilder(s);
            char ch = sb.charAt(i);
            
            char dec = ch=='0' ? '9' : (char) (ch-1);
            char inc = ch=='9' ? '0' : (char) (ch+1);

            sb.setCharAt(i , dec);
            if(!vis.contains(sb.toString()) && !dead.contains(sb.toString())){
                q.add(sb.toString());
                vis.add(sb.toString());
            }
            sb.setCharAt(i , inc);
            if(!vis.contains(sb.toString()) && !dead.contains(sb.toString())){
                q.add(sb.toString());
                vis.add(sb.toString());
            }
        }
    }
    public int openLock(String[] deadends, String target) {
        
        Set<String> dead = new HashSet<>();
        for(String s: deadends) dead.add(s);

        if(dead.contains("0000")) return -1;

        Set<String> vis = new HashSet<>();
        vis.add("0000");
        Queue<String> q = new LinkedList<>();
        q.add("0000");
        int ans = 0;

        while(!q.isEmpty()){
            int n = q.size();

            while(n!=0){
                String curr = q.remove();
                if(curr.equals(target)) return ans;

                generateNeighbours(q , dead , vis , curr);

                n--;
            } 
            ans++;  
        }  
        return -1;
    }
}