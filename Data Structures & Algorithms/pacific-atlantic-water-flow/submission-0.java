class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m=heights.length;
        int n=heights[0].length;
        int[][] pac=new int[m][n];
        int[][] atl=new int[m][n];
        List<List<Integer>> list=new ArrayList<>();
        Queue<int[]> pacQueue=new LinkedList<>();
        Queue<int[]> altQueue=new LinkedList<>();
//      I row and the Last Row 
        for(int i=0;i<n;i++){
            pac[0][i]=1;
            atl[m-1][i]=1;
            pacQueue.add(new int[]{0,i});
            altQueue.add(new int[]{m-1,i});

        }
        // I Col and the Last Column 
        for(int i=0;i<m;i++){
            pac[i][0]=1;
            atl[i][n-1]=1;
            pacQueue.add(new int[]{i,0});
            altQueue.add(new int[]{i,n-1});
        }
        bfs(pacQueue,heights,pac);
        bfs(altQueue,heights,atl);
        int index=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(pac[i][j]==1&&atl[i][j]==1){
                    list.add(new ArrayList<>());
                    list.get(index).add(i);
                    list.get(index).add(j);
                    index++;

                }
            }
        }
        return list;

         
    }
    public void bfs(Queue<int[]> q,int[][] heights,int[][] visited){
        int[][] directions={{-1,0},{1,0},{0,-1},{0,1}};
        while(!q.isEmpty()){
            int[] box=q.poll();
            int r=box[0];
            int c=box[1];
            
            for(int[] dir:directions){
                int nr=r+dir[0];
                int nc=c+dir[1];
                if(nr>=0&&nc>=0&&nr<heights.length&&nc<heights[0].length&&visited[nr][nc]!=1&&
                heights[nr][nc]>=heights[r][c]){
                    q.add(new int[]{nr,nc});
                    visited[nr][nc]=1;

                }
            }

        }
    }
}
