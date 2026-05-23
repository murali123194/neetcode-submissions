class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<stones.length;i++){
            pq.add(stones[i]);
        }
        while(!pq.isEmpty()&&pq.size()!=1){
            int x=pq.poll();
            int y=pq.poll();
            if(x==y){
                continue;
            }
            else if(x>y){
                pq.add(x-y);
            }
            else{
                pq.add(y-x);
            }


        }
        if(pq.size()==1)return pq.poll();
        else return 0;
        
    }
}
