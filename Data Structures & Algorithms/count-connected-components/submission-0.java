class Solution {
    public int countComponents(int n, int[][] edges) {
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
        int con_components=0;
        int[] visited=new int[n];
        for(int i=0;i<n;i++){
            if(visited[i]!=1){
                dfs(i,adj,visited);
                con_components++;
            }
        }
        return con_components;

        

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
