class Solution {
    public boolean canJump(int[] nums) {
        // int[][] memo=new int[nums.length][1000];
        boolean[] memo=new boolean[nums.length];
        // Arrays.fil
        return jump(nums,nums[0],0,memo);


        
    }
    private boolean jump(int[] nums,int steps,int i,boolean[] memo){
        if(i==nums.length-1)return true;
        if(memo[i])return true;
        boolean canReach=false;
        for(int j=1;j<=steps;j++){
            if(i+j<nums.length){
                // if(nums[i+j]0){
                    if(jump(nums,nums[i+j],i+j,memo)) {
                    canReach=true;
                    return true;
                }
                // }
            }
        }
        return memo[i]=canReach;
    }
}
