class Solution {
    public int countTriplets(int[] arr) {
        int count =0 , n = arr.length;
        for(int i=0;i<n;i++){
            int a = 0;
            for(int j=i+1;j<n;j++){
                a = a ^ arr[j-1];
                int b=0;
                for(int k=j;k<n;k++){
                    b = b ^ arr[k];
                    if(a==b) count++;
                }
            }
        }
        return count;
    }
}