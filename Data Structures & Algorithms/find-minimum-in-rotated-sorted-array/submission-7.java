// class Solution {
//     public int findMin(int[] nums) {
//         int low=0;
//         int high=nums.length-1;
//         while(low<=high){
//             if(nums[low]<=nums[high]){
//                 return nums[low];
//             }
//             int mid=low+(high-low)/2;
//             if((mid==0||nums[mid]<nums[mid-1])&&(mid==nums.length-1||nums[mid]<nums[mid+1])){
//                 return nums[mid];
//             }
//             if(nums[low]<=nums[mid]){
//                 low=mid+1;
//             }else{
//                 high=mid-1;
//             }
//         }
//         return -1;
        
//     }
// }
public class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int res = nums[0];

        while (l <= r) {
            if (nums[l] <=nums[r]) {
                res = Math.min(res, nums[l]);
                break;
            }

            int m = l + (r - l) / 2;
            res = Math.min(res, nums[m]);
            if (nums[m] >= nums[l]) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return res;
    }
}