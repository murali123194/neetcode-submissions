class Solution {
    public int maxSubArray(int[] nums) {
        int ans=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int sum=nums[i];
            ans=Math.max(ans,sum);
            for(int j=i+1;j<n;j++){
                sum+=nums[j];
                ans=Math.max(ans,sum);
            }
        }
        return ans;
        


        
        
    }
}
