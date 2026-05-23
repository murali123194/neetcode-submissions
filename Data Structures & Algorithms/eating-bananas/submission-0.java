class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // This BS is for the numbers and this technque is used to find the floor value 
        // of the given numeber
        int n=piles.length;
        int max=-1;
        for(int i=0;i<n;i++){
            max=Math.max(max,piles[i]);

        }
        int low=1;
        int high=max;
        int res=high;
        while(low<=high){
            int time=0;
            int mid=(low+high)/2;
            for(int pile:piles){
                time+=Math.ceil((double)pile/mid);
            }
            if(time<=h){
                res=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return res;
        
    }
}
