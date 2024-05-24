class Solution {
    int ans=0;
    int n;
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[] fre = new int[26];
        for(char ch : letters){
            fre[ch - 'a']++;
        }
        n = words.length;
        back(0 , score , words , 0 , fre);
        return ans;
    }
    public void back(int idx , int[] score , String[] words , int currS , int[] fre){
        ans = Math.max(ans , currS);

        if(idx>=n) return;

        int[] tempF = Arrays.copyOf(fre , fre.length);
        int j =0 , tempScore =0;
        while(j < words[idx].length()){
            char ch = words[idx].charAt(j);
            tempF[ch-'a']--;
            tempScore+=score[ch-'a'];
            
            if(tempF[ch-'a'] < 0) break;

            j++;
        }
        if(j>=words[idx].length()){
            back(idx+1 , score , words , currS+tempScore , tempF);
        }
        back(idx+1 , score , words , currS , fre);
    }
}