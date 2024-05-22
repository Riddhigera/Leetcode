class Solution {
    int n;
    public boolean isPali(String s, int l , int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> curr = new ArrayList<>();

        n = s.length();
        
        back(s , 0 ,ans , curr);
        return ans;
    }
    public void back(String s , int idx ,List<List<String>> ans  ,  List<String> curr){
        if(idx>=n){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i=idx;i<n;i++){
            if(isPali(s , idx , i)){
                curr.add(s.substring(idx,i+1));
                back(s , i+1 , ans , curr);
                curr.remove(curr.size()-1);
            }
        }
    }
}