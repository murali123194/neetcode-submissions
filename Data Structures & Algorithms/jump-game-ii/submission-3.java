class Solution {
    public int jump(int[] nums) {
        int l=0,r=0,steps=0;
        while(r<nums.length-1){
            int res=l;
            for(int i=l;i<=r;i++){
                res=Math.max(res,i+nums[i]);
            }
            l=r;
            r=res;
            steps++;

        }
        return steps;
        
    }
}
