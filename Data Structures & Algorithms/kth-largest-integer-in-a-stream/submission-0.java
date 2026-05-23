class KthLargest {
    public PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
    public int k=0;

    public KthLargest(int k, int[] nums) {
        for(int num:nums)this.pq.add(num);
        this.k=k;
        
        
    }
    
    public int add(int val) {
        this.pq.add(val);
        int count=0;
        int kthValue=0;
        int[] checkList=new int[k];
        while(!pq.isEmpty()){
            checkList[count]=pq.poll();
            if(count==this.k-1){kthValue=checkList[count];break;}
            count++;
        }
        for(int num:checkList)this.pq.add(num);
        return kthValue;
        
        
    }
}
