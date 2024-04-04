class Solution {
    public int maxDepth(String s) {
        int openParen = 0;
        int maxDepth = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                openParen++;
            } else if(s.charAt(i) == ')'){
                openParen--;
            }
            maxDepth = Math.max(maxDepth , openParen);
        }
        return maxDepth;
        
    }
}