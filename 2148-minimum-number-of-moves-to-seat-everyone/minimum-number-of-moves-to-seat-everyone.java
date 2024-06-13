class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int ans = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int j=seats.length-1;j>=0;j--){
            ans+=Math.abs(seats[j] - students[j]);
        }
        return ans;
    }
}