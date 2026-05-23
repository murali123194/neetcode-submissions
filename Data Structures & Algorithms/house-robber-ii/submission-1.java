class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        int m1=excludeLast(nums);
        int m2=excludeFirst(nums);
        int ans=Math.max(m1,m2);
        return ans;

        
    }
    public int excludeLast(int[] nums){
        int n=nums.length-1;
        int[] dp=new int[n];
        dp[0]=nums[0];
        if(n==1)return nums[0];
        dp[1]=nums[1];
        int max=Math.max(dp[0],dp[1]);
        for(int i=2;i<n;i++){
            int cost=Integer.MIN_VALUE;
            for(int j=0;j<i-1;j++){
                cost=Math.max(cost,dp[j]);
            }
            dp[i]=cost+nums[i];
            max=Math.max(max,dp[i]);

        }
        return max;

    }
    public int excludeFirst(int[] nums){
        int n=nums.length;
        int[] dp=new int[n];
        // if(n==2)return nums[1]; 
        dp[0]=0;
        dp[1]=nums[1];
        if(n==2)return nums[1];
        else dp[2]=nums[2];
        int max=Math.max(dp[2],dp[1]);
        for(int i=3;i<n;i++){
            int cost=Integer.MIN_VALUE;
            for(int j=1;j<i-1;j++){
                cost=Math.max(cost,dp[j]);
            }
            dp[i]=cost+nums[i];
            max=Math.max(max,dp[i]);

        }
        return max;

    }
}
