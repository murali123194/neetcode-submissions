class Solution {
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] dp=new int[n][m];
        int colSum=0;
        for(int i=0;i<n;i++){
            colSum+=grid[i][0];
            dp[i][0]=colSum;
        } 

        int rowSum=0;
        for(int j=0;j<m;j++){
            rowSum+=grid[0][j];
            dp[0][j]=rowSum;
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];

            }
        } 
        return dp[n-1][m-1];      
    }
}