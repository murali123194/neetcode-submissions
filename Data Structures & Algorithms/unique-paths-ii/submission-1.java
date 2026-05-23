class Solution {
    // private static int count=0;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][] dp=new int[m][n];
        int idxValue=1;
        for(int i=0;i<m;i++){
            if(obstacleGrid[i][0]==1)idxValue=0;
            dp[i][0]=idxValue;
        }
        idxValue=1;
        for(int j=0;j<n;j++){
            if(obstacleGrid[0][j]==1)idxValue=0;
            dp[0][j]=idxValue;

        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                boolean flag =false;
                if(obstacleGrid[i][j]==1)flag =true;
                
                else if(j+1<n&&i+1<m){
                    if(obstacleGrid[i+1][j]==1&&obstacleGrid[i][j+1]==1){
                        flag=true;
                    }
                }
                // flag==true?dp[i][j]=dp[i-1][j]+dp[i][j-1]:dp[i][j]=0;if(flag){
                if(!flag){dp[i][j] = dp[i-1][j] + dp[i][j-1];
                } else {
                    dp[i][j] = 0;
                }
                
            }
        }
        return dp[m-1][n-1];
        

        


        
    }
    // private void dfs(int[][] grid,int )
}