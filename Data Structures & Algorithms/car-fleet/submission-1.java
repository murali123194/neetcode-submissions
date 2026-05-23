class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[0]-a[0]);
        for(int i=0;i<position.length;i++){
            pq.offer(new int[]{position[i],speed[i]});
        }
        // int fleet=0;
        Stack<Double> stack=new Stack<>();
        while(!pq.isEmpty()){
            int[] car =pq.poll();
            double time=(double)(target-car[0])/car[1];
            if(stack.isEmpty()||time>stack.peek()){
                stack.push(time);
            }     
        }
        return stack.size();
        
        
        
        
    }
}
