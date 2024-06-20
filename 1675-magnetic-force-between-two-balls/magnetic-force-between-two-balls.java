class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int st =0 ;
        int end = position[position.length-1], ans = -1;
        // for(int i : position) end = Math.max(end , i);

        while(st <= end){
            int mid  = st + (end - st)/2;
            if(isPossible(position , m , mid)){
                st = mid+1;
                ans = mid;
            }
            else end = mid-1;
        }
        return ans;
    }
    public boolean isPossible(int[] arr , int m , int mid){
        int countM = 1;
        int last = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i] - last >= mid){
                countM++;
                last = arr[i];
                if(countM == m) return true;
            }
        }
        return false;

    }
}