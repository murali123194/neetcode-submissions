class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        int n=nums.length;
        int[] ans =new int[n-k+1];
        for(int i=0;i<k;i++){
            pq.add(nums[i]);

        }
        int idx=0;
        ans[idx++]=pq.peek();
        for(int i=k;i<n;i++){
            pq.add(nums[i]);
            pq.remove(nums[i-k]);
            ans[idx++]=pq.peek();
        }
        return ans;
        
    }
}
