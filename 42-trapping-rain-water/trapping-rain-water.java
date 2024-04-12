class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int Left[]=new int[n];
        int Right[]=new int[n];
        Left[0]=height[0];
        for(int i=1;i<height.length;i++){
            Left[i]=Math.max(Left[i-1],height[i]);
        }
        Right[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            Right[i]=Math.max(Right[i+1],height[i]);

        }
        int ans=0;
        for(int i=0;i<Right.length;i++){
            ans=ans+Math.min(Left[i],Right[i])-height[i];
        }
        return ans;

    }
    
}