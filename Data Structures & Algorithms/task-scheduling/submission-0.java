class Solution {
    public int leastInterval(char[] tasks, int n) {
        int time=0;
        int[] A=new int[26];
        for(char c :tasks){
            A[c-'A']++;
        }
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>((a,b)->b-a);
        for(int m:A){
            if(m>0){
                maxHeap.add(m);
            }
        }
        Queue<int[]> q=new LinkedList<>();
        while (!maxHeap.isEmpty() || !q.isEmpty()) {
            time++;

            if (maxHeap.isEmpty()) {
                time = q.peek()[1];
            } else {
                int cnt = maxHeap.poll() - 1;
                if (cnt > 0) {
                    q.add(new int[]{cnt, time + n});
                }
            }

            if (!q.isEmpty() && q.peek()[1] == time) {
                maxHeap.add(q.poll()[0]);
            }
        }
            
        
        return time;
        
        
    }
}
