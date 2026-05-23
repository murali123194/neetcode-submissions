class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int num:nums){
            sum+=num;
        }
        if(sum%2!=0)return false;
        int k=sum/2;
        boolean[][] dp=new boolean[n+1][k+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=true;
        }
        for(int j=1;j<=k;j++){
            dp[0][j]=false;
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=k;j++){
                if(j>=nums[i-1]){
                    dp[i][j]=dp[i-1][j-nums[i-1]]||dp[i-1][j];
                }
                else dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][k];
        
    }
}
