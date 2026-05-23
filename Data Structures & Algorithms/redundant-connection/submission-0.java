class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        // List<List<Integer>> adj=new ArrayList<>();
        int n=edges.length;
        List<List<Integer>> adj=new ArrayList<>();
        // Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        int[] indegree=new int[n+1];
        
        for(int i=0;i<n;i++){
            int src=edges[i][0];
            int des=edges[i][1];
            adj.get(src).add(des);
            adj.get(des).add(src);
            indegree[src]++;
            indegree[des]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=n;i++){
            if(indegree[i]==1){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int src=q.poll();
            for(int nei:adj.get(src)){
                indegree[nei]--;
                if(indegree[nei]==1){
                    q.add(nei);
                }
            }

        }
        for(int i=edges.length-1;i>=0;i--){
            int src=edges[i][0];
            int des=edges[i][1];
            if(indegree[src]==2&&indegree[des]>1){
                return new int[]{src,des};
            }
        }
            return new int[0]; 
        }
}

        
        
            

    

        



        
    
    
    

