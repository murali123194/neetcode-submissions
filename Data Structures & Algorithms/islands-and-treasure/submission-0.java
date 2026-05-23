class Solution {
    public int INF=Integer.MAX_VALUE;
    public void islandsAndTreasure(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    bfs(grid,i,j);

                }
            }
        }
        
        
    }
    public void bfs(int[][] grid,int r,int c){
        Queue<int[]> queue=new LinkedList<>();
        queue.add(new int[]{r,c});
        int[][] directions={{-1,0},{1,0},{0,-1},{0,1}};

        while(!queue.isEmpty()){
            int[] box=queue.poll();
            int row=box[0];
            int col=box[1];
            for(int[] dir:directions){
                int row1=row+dir[0];
                int col1=col+dir[1];
                if(row1>=0&&row1<grid.length&&
                col1>=0&&col1<grid[0].length&&
                (grid[row1][col1]==INF||grid[row1][col1]>grid[row][col]+1)){
                    queue.add(new int[]{row1,col1});
                    grid[row1][col1]=grid[row][col]+1;
                }
            }

        }
    }
}
