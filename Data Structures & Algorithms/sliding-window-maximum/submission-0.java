class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] ans=new int[n-k+1];
        
        for(int i=0;i<n-k+1;i++){
            int maxValue=nums[i];
            for(int j=i+1;j<k+i&&j<n;j++){
                if(maxValue<nums[j]){
                    maxValue=nums[j];
                }
            }
            ans[i]=maxValue;

        }
        return ans;
        
    }
}
