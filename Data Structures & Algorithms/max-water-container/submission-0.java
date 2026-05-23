class Solution {
    public int maxArea(int[] heights) {
        // FInd the max height and the next  max height;
        // If use PQ,in reverse with 
        int l=0;
        int r=heights.length-1;
        int area=0;
        while(l<r){
            int minHeight=Math.min(heights[l],heights[r]);
            area=Math.max(area,minHeight*(r-l));
            if(heights[l]<=heights[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return area;

        
        
        
    }
}
