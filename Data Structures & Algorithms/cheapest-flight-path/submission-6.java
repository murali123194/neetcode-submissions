class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        Queue<int[]> pq=new LinkedList<>();
        // COnvert into the matrix;
        // int n=flights.length;
        int[][] mat=new int[n][n];

        for(int[] arr:mat)Arrays.fill(arr,10000000);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j)mat[i][j]=0;
            }
        }
        for(int[] A:flights){
            mat[A[0]][A[1]]=A[2];
        }
        // PriorityQueue<Integer> ans=new PriorityQueue<>()
        int[] dist=new int[n];
        Arrays.fill(dist,100000000);
        dist[src]=0;
        pq.add(new int[]{src,0,0});
        int k1=k;
        // while(k>=0){
        //     int size=pq.size();
        while(!pq.isEmpty()){
            int[] B=pq.poll();
            int u=B[0];
            int d=B[1];
            int s=B[2];
            if(s>k1)continue;
            
            // This is the versionn of visited ,we may come accross the same vertex from the pq ,that time 
            // if(d>dist[u])continue;
            
            for(int v=0;v<n;v++){
                if(u==v)continue;
                int weight=mat[u][v];
                if(d+weight<dist[v]){
                    dist[v]=d+weight;
                    pq.add(new int[]{v,dist[v],s+1});
                    
                }
            }
            // size--;
        }
        // k--;
            
            // return ans.poll()

            
            
        // }
        
        if(dist[dst]>=10000000)return -1;
        else return dist[dst];

    }
}