class Solution {
    public int removeElement(int[] nums, int val) {
        int nValues=0;
        int l=0;
        int n=nums.length;
        int r=n-1;

        while(l<=r){
            if(nums[l]==val){
                nValues++;
                if(nums[r]==val){
                    r--;
                }
                else {
                    int temp=nums[l];
                    nums[l]=nums[r];
                    nums[r]=temp;
                    l++;
                    r--;
                }
            }
            else {
                l++;
            }
        }

        return n-nValues;

        
    }
}