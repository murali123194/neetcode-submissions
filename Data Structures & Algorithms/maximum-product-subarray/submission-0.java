class Solution {
    public int maxProduct(int[] nums) {
        long max=Long.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            long product=nums[i];
            max=Math.max(max,product);
            for(int j=i+1;j<n;j++){
                product*=nums[j];
                max=Math.max(max,product);
            }
        }
        return (int)max;
        
    }
}
