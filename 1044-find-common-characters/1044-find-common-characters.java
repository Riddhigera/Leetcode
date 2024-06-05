class Solution {
    public List<String> commonChars(String[] words) {
        List<String> ans = new ArrayList<>();
        int n  = words.length;
        for(char ch : words[0].toCharArray()){
            String s = String.valueOf(ch);
            ans.add(s);
        }
        if(n==1) return ans;
        
        List<String> temp = new ArrayList<>();
        for(int i=1;i<n;i++){
            List<String> t = new ArrayList<>();
            for(char ch : words[i].toCharArray()){
                if(ans.contains(String.valueOf(ch))){
                    ans.remove(String.valueOf(ch));
                    t.add(String.valueOf(ch));
                }
            }
            ans.clear();
            ans.addAll(t);
        }
        return ans;
    }
}