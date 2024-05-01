class Solution {
    public String reversePrefix(String word, char ch) {
        int s=0;
        int e=word.indexOf(ch);
        int l=e;
        String ans="";
        if(e==-1) return word;

        while(e>=s){
            ans=ans+word.charAt(e);
            e--;
        }
        for(int i=l+1;i<word.length();i++){
            ans=ans+word.charAt(i);
        }
        return ans;
        
    }
}