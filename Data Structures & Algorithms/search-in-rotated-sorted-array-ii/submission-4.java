class Solution {
    public boolean search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        boolean found =false;
        while(l<=r){
            int m=(l+r)/2;
            if(nums[m]==target)return true;
            if(nums[l]==nums[m]&&nums[m]==nums[r]){
                l=l+1;
                r=r-1;
            }
            else if(nums[l]<=nums[m]){
                if(target>=nums[l]&&target<nums[m]){
                    r=m-1;
                }
                else{
                    l=m+1;
                }
            }
            else if(nums[m]<=nums[r]){
                if(target<=nums[r]&&target>nums[m]){
                    l=m+1;
                }
                else r=m-1;;
            }
            

        }
        return found;
        
    }
}