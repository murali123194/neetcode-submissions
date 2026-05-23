class Solution {
    public int findPeakElement(int[] nums) {
        int l=0;
        int n=nums.length-1;
        int r=n;
        while(l<=r){
            int m=(l+r)/2;
            
            if(m==0){
                if(n>0){
                if(nums[m]>nums[m+1])return m;
                }
                if(n==0)return 0;
            }
            if(m==n){
                if(nums[m-1]<nums[m])return m;
            }
            if(nums[m]>nums[m+1]&&nums[m]>nums[m-1])return m;
            if(nums[m+1]>nums[m])l=m+1;
            else if(nums[m-1]>nums[m])r=m-1;
        }
        return -1;
        
    }
}