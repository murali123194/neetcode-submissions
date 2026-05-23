class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        if(n==1)return nums[0];
        dp[0]=nums[0];
        dp[1]=nums[1];
        int max=Math.max(dp[0],dp[1]);
        for(int j=2;j<n;j++){
            int cost1=Integer.MIN_VALUE;
            for(int i=0;i<j&&i!=j-1;i++){
                cost1=Math.max(cost1,dp[i]);
            }
            dp[j]=nums[j]+cost1;
            max=Math.max(max,dp[j]);

        
        
    }
    return max;
}
}
