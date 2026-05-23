class Solution {
    public boolean validTree(int n, int[][] edges) {
        // Convert into the adjList;
        // 
        int m=edges.length;
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int src=edges[i][0];
            int des=edges[i][1];
            adj.get(src).add(des);
            adj.get(des).add(src);
        }
        int[] visited=new int[n];
        dfs(0,adj,visited);
        int len=0;
        for(int num:visited){
            if(num==1){
                len++;
            }
        }
        if(len!=n){
            return false;
        }
        if(edges.length==n-1){
            return true;
        }else{
            return false;
        }
        
        

    }
    public void dfs(int i,List<List<Integer>> adj,int[] visited){
        visited[i]=1;
        for(int neighbor:adj.get(i)){
            if(visited[neighbor]!=1){
                dfs(neighbor,adj,visited);
            }
        }

    }
}
