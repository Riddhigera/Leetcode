class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer,Integer> h = new TreeMap<>();
        
        for(int i : arr1){
            h.put(i , h.getOrDefault(i , 0)+1);
        }
        int[] ans = new int[arr1.length];
        int k =0;
        for(int i=0;i<arr2.length;i++){
            int val = h.get(arr2[i]); 
            while(val > 0){
                ans[k++] = arr2[i];
                val--;
            }
            h.remove(arr2[i]);
        }

        for(var it : h.entrySet()){
            int key = it.getKey();
            int val = it.getValue();
            while(val!=0){
                ans[k++] = key;
                val--;
            }
            h.put(key , 0);
        }
        
        return ans;
    }
}