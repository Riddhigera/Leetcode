class Trio{
    double sort ;
    int f1 , f2;
    public Trio(double sort , int f1 , int f2){
        this.sort = sort;
        this.f1 = f1;
        this.f2 = f2;
    }
}
class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int[] ans = new int[2];
        int n = arr.length;
        PriorityQueue<Trio> pq = new PriorityQueue<>((a,b)->{
            return Double.compare(b.sort , a.sort);
        });
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                pq.add(new Trio((double)arr[i]/arr[j] , i , j));
                if(pq.size() > k){
                    pq.remove();
                }    
            }
        }
        ans[0] = arr[pq.peek().f1];
        ans[1] = arr[pq.peek().f2];
        return ans;
    }
}