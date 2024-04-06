class Solution {
    public String minRemoveToMakeValid(String s) {
        int n = s.length();
        boolean[] vis = new boolean[n];
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)) continue;

            if(ch == '(') st.push(i);

            else{
                if(!st.isEmpty()) st.pop();
                else vis[i] = true;
            }
        }
        while(!st.isEmpty()) vis[st.pop()] = true;
        String ans = "";
        for(int i=0;i<n;i++){
            if(!vis[i]) ans = ans + s.charAt(i);
        }
        return ans;
    }
}