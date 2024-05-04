class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length;
        int st =0 , end = n-1 , ans = 0;
        while(st <= end){
            int sum = people[st] + people[end];
            if(sum <= limit){
                st++;
            }
            end--;
            ans++;
        } 
        return ans;
    }
}