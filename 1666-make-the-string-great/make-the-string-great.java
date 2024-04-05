class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        String ans="";

        for(int i=0;i<s.length();i++){
            if(!st.isEmpty()){
                int top=st.peek();
                int curr=s.charAt(i);
                if(Math.abs(top-curr)==32) st.pop();
                else st.push(s.charAt(i));

            }
            else st.push(s.charAt(i));
        }
        while(!st.isEmpty()){
            ans=st.pop() +ans;
        }
        return ans;
        
    }
}