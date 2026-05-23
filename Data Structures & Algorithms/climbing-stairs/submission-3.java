class Solution {
    public int climbStairs(int n) {
        // Uses the fibonacci technique
        // if(n==0||n==1)return 1;
        // return climbStairs(n-1)+climbStairs(n-2);
        int[] dp=new int[n+1];
        dp[0]=1;
        for(int j=1;j<=n;j++){
            for(int i=1;i<=2;i++){
                if(i<=j)dp[j]+=dp[j-i];
            }
        }
        return dp[n];
        
        
    }
}
