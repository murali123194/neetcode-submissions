class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        /*
        1.Dikjstars:
        2.distance array and then the priorityQueue 
        3.return the max in the dist Array ,if it is MAX_VALUE return -1 else max 

        // Adjacency list 
        and perform the Dikstras with k as the source ;
        */
        class Pair{
            int v;
            int weight;
            Pair(int v,int w){
                this.v=v;
                this.weight=w;
            }
        }
        List<List<Pair>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        } 
        for(int i=0;i<times.length;i++){
            int src=times[i][0];
            int des=times[i][1];
            int w=times[i][2];
            adj.get(src-1).add(new Pair(des-1,w));
        }

        int[] dist=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k-1]=0;
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.weight-b.weight);
        pq.add(new Pair(k-1,0));
        while(!pq.isEmpty()){
            Pair vertex=pq.poll();
            int u=vertex.v;
            int weight=vertex.weight;
            if(weight>dist[u])continue;
            for(Pair nei:adj.get(u)){
                int w=nei.weight;
                int v=nei.v;
                if((dist[u]+w)<dist[v]){
                    dist[v]=dist[u]+w;
                    pq.add(new Pair(v,dist[v]));
                }
            }
        }

        int max=0;
        for(int num:dist){
            // System.out.print(num);
            if(num>max)max=num;
        }
        
        return max==Integer.MAX_VALUE?-1:max;

        
    }
}
