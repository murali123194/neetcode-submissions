class Solution {
    public int combinationSum4(int[] nums, int target) {
        // Use the unbounded knapsack
        int n=nums.length; 

        int[] dp=new int[target+1];
        dp[0]=1;
        for(int i=1;i<=target;i++){
            for(int j=0;j<n;j++){
                if(i>=nums[j]){
                    dp[i]+=dp[i-nums[j]];
                }
            }
        }
        return dp[target];

        // outer -->Target

        // inner --> items 


        // int[][] dp=new int[n+1][target+1];
        // // If the sum is 0 and the no of possible ways to form is not slecting anything 
        // // so it becomes 1
        // // Initilaise the first Column
        // for(int i=0;i<=n;i++){
        //     dp[i][0]=1;
        // }
        // // Initialise the first row
        // for(int j=0;j<=target;j++){
        //     dp[0][j]=0;
        // }

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=target;j++){
        //         if(nums[i-1]<=j){
        //             dp[i][j]=dp[i][j-nums[i-1]]+dp[i-1][j];
        //         }
        //         else dp[i][j]=dp[i-1][j];
        //     }
        // }
        // return dp[n][target];
        
    }
}