class Solution {
    public int compareVersion(String ver1, String ver2) {
        String[] v1 = ver1.split("\\.");
        String[] v2 = ver2.split("\\."); 
        int i=0,j=0,ans = 0;
        int n  = v1.length, m = v2.length;
        while(i<n && j<m){
            String c1 = v1[i++];
            String c2 = v2[j++];
            int val1 = Integer.parseInt(c1);
            int val2 = Integer.parseInt(c2);
            if(val1 > val2) return 1;
            else if(val1 < val2) return -1;
        }
        while(i < n){
            if(Integer.parseInt(v1[i]) > 0) return 1;
            i++;
        }
        while(j < m){
            if(Integer.parseInt(v2[j]) > 0) return -1;
            j++;
        }
        
        return 0;
    }
}