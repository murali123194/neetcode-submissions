class Solution {
    private static int[][] dirs={{0,1},{0,-1},{1,0},{-1,0}};
    public int maxAreaOfIsland(int[][] grid) {

        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    max=Math.max(max,dfs(grid,i,j,0));
                }
            }
        }
        return max;
        
        
    }
    private int dfs(int[][] grid,int r,int c,int res){
        if(r<0||c<0||r>=grid.length||c>=grid[0].length||grid[r][c]==0){

            return 0;
        }
        grid[r][c]=0;
        res=1;
        for(int[] d:dirs){
            int nr=r+d[0];
            int nc=c+d[1];
            res+=dfs(grid,nr,nc,res);
        }
        return res;
        

    }
}
