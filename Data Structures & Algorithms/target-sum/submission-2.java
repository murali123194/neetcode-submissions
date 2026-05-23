class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        int s1=(sum+target);
        if(s1%2!=0)return 0;
        int[][] dp=new int[n+1][s1/2+1];
        s1=s1/2;
        

        dp[0][0]=1;

        for(int j=1;j<=s1;j++){
            dp[0][j]=0;
        }
        for(int i=1;i<=n;i++){
            
            for(int j=0;j<=s1;j++){
                if(i==0&&j==0){
                dp[i][j]=1;
                continue;
                }
                if(j>=nums[i-1]){
                    dp[i][j]=dp[i-1][j-nums[i-1]]+dp[i-1][j];
                }
                else {
                    dp[i][j]=dp[i-1][j];
                }

            }
        }
        return dp[n][s1];
    }
}
