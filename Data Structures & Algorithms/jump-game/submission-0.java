class Solution {
    public boolean canJump(int[] nums) {
        return jump(nums,nums[0],0);

        
    }
    private boolean jump(int[] nums,int steps,int i){
        if(i==nums.length-1)return true;
        boolean canReach=false;
        for(int j=1;j<=steps;j++){
            if(i+j<nums.length){
                // if(nums[i+j]0){
                    if(jump(nums,nums[i+j],i+j)) {
                    canReach=true;
                    return true;
                }
                // }
            }
        }
        return canReach;
    }
}
