class Solution {
    public int numSquares(int n) {
        // no of perfect squares 
        int n1=(int)Math.sqrt(n);
        int INF=Integer.MAX_VALUE-1;
        int[][] dp=new int[n1+1][n+1];
        // ===============================
        // Setting the first column with 0;
        // bcz to make sum =0,no perfect squares are required
        // ================================
        for(int i=0;i<=n1;i++){
            dp[i][0]=0;
        }
        // ============================
        // with no elements ,we cant make sum >0 ,so that sum wont be possible 
        // So it is INF
        // =============================
        for(int j=1;j<=n;j++){
            dp[0][j]=INF;
        }
        for(int i=1;i<=n1;i++){
            int square=i*i;
            for(int j=1;j<=n;j++){
                if(j>=square){
                    dp[i][j]=Math.min(dp[i][j-square]+1,dp[i-1][j]);
                }
                else {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n1][n];
        
        
    }
}