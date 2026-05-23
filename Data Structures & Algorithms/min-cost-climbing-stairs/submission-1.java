class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[]dp=new int[n+1];
        dp[0]=cost[0];
        dp[1]=cost[1];
        for(int j=2;j<=n;j++){
            int cost1=Integer.MAX_VALUE;
            for(int i=1;i<=2;i++){
                cost1=Math.min(cost1,dp[j-i]);
            }
            if(j!=n)dp[j]=cost[j]+cost1;
            else dp[j]=cost1;
        }
        return dp[n];
        
    }
}
