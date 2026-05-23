class MedianFinder {
    private PriorityQueue<Integer> pq;

    public MedianFinder() {
        pq=new PriorityQueue<>();
        
    }
    
    public void addNum(int num) {
        pq.add(num);
        
    }
    
    public double findMedian() {
        List<Integer> ans=new LinkedList<>();
        int n=pq.size();
        for(int i=0;i<n;i++)ans.add(pq.poll());
        for(int num:ans){
            pq.add(num);
        }
        
        int idx=n/2;
        // if(n==1)return ans.get(0);
        if(n%2==0){
            
            return (double)(ans.get(idx)+ans.get(idx-1))/2;
        }
        return ans.get(idx);
        
    }
}
