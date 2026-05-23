class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int area=0;
        for(int i=0;i<n;i++){
            int min=heights[i];
            
            
            
            for(int j=i;j<n;j++){
                min=Math.min(min,heights[j]);
                int area1=min*(j-i+1);
                area=Math.max(area,area1);

                    

                
            
            
        }
        }
        return area;
        
    }
}
