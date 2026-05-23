class Solution {
    public int climbStairs(int n) {
        // Uses the fibonacci technique
        // if(n==0||n==1)return 1;
        // return climbStairs(n-1)+climbStairs(n-2);
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int j=2;j<=n;j++){
            
                dp[j]=(dp[j-1]+dp[j-2]);
            
        }
        return dp[n];
        
        
    }
}
