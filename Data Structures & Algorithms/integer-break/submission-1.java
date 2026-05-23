class Solution {
    public int integerBreak(int n) {
        int[][] dp=new int[n][n+1];
        for(int i=0;i<n;i++){
            dp[i][0]=1;
        }
        for(int j=1;j<=n;j++){
            dp[0][j]=0;
        }
        dp[0][0]=0;

        for(int i=1;i<n;i++){
            for(int j=1;j<=n;j++){
                if(j>=i){
                    dp[i][j]=Math.max(dp[i][j-i]*i,dp[i-1][j]);
                }
                else {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n-1][n];
    }
}