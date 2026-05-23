class Solution {
    public int minCostConnectPoints(int[][] points) {
        int v=points.length;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        // The adj List is nothing but the points for every vertex ,i.e,Complete graph
        boolean[] visited=new boolean[v];
        Arrays.fill(visited,false);
        
        int ans=0;
        pq.add(new int[]{0,0});
        // int n=2;
        while(!pq.isEmpty()){
            int[] A=pq.poll();
            int src=A[0];
            int wei=A[1];
            if(visited[src])continue;
            ans+=wei;
            visited[src]=true;
            for(int i=0;i<v;i++){
                if(i!=src){
                    int dis=Math.abs(points[src][0]-points[i][0])+Math.abs(points[src][1]-points[i][1]);
                    if(!visited[i])pq.add(new int[]{i,dis});
                }
            }
            // n++;

        }
        return ans;

    }
}
