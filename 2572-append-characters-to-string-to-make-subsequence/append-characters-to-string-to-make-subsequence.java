class Solution {
    public int appendCharacters(String s, String t) {
        int i=0,j=0;
        
        while(i<s.length() && j<t.length()){
            char sh = s.charAt(i);
            char th = t.charAt(j);

            if(sh == th){
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        if(j >= t.length()) return 0;
        else {
            return t.length() - j;
        }
    }
}