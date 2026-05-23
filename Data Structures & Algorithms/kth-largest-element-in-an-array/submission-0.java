class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int num:nums){
            pq.add(num);
        }
        int count=1;
        int kLargest=0;
        while(!pq.isEmpty()){
            if(count==k){kLargest=pq.poll();break;}
            pq.poll();
            count++;

        }return kLargest;
        
    }
}
