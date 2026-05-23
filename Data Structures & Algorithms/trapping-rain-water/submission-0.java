class Solution {
    public int trap(int[] height) {
        // Take the prefix  arrfor the grateer element before i
        // Take theb suffix arr for the greater ele after i
        int n=height.length;
        int[] prefix =new int[n];
        int[] suffix =new int[n];
        prefix[0]=-1;
        int maxLeft=-1;
        for(int i=1;i<n;i++){
            if(maxLeft<height[i-1]){
                maxLeft=height[i-1];
            }
            prefix[i]=maxLeft;
            
        }
        int maxRight=-1;
        suffix[n-1]=maxRight;
        for(int i=n-2;i>=0;i--){
            if(maxRight<height[i+1]){
                 maxRight=height[i+1];
            }
            suffix[i]=maxRight;
        }
        int area=0;
        for(int i=1;i<n-1;i++){
            int min=Math.min(prefix[i],suffix[i]);
            int add=min-height[i];
            if(add>=0){
                area+=add;
            }

        }
        return area;
        
        
    }
}
