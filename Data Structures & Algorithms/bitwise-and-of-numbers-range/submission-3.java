class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int ans=left&right;
        left++;
        right--;
        while(left<=right){
            ans&=left;
            ans&=right;
            left++;
            right--;
        }
        return ans;
        
    }
}