class Solution {
    public int longestPalindrome(String s) {
        Map<Character , Integer> h = new HashMap<>();
        for(char ch : s.toCharArray()){
            h.put(ch , h.getOrDefault(ch , 0)+1);
        }
        
        int sum = 0 , odd = 0;

        for(int i: h.values()){
            if(i%2==0){
                sum += i;
            }
            else if(i%2==1 && i!=1){
                sum += i-1;
                odd = 1;
            }
            else if(i ==1) odd = 1;
        }
        return sum + odd;
    }
}