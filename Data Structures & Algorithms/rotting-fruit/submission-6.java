class Solution {
    public int orangesRotting(int[][] grid) {
        int time=0;
        int not_fresh=0;
        int n=grid.length;
        int m=grid[0].length;
        int ones=0;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                    grid[i][j]=0;
                    // not_fresh=1;
                    
                }
                if(grid[i][j]==1){
                    ones++;
                }
            }
        }
        // if(not_fresh==0&&ones>0)return 0;
        
        int[][] directions={{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()&&ones>0){
            int size=q.size();
            time++;
            while(size>0){
                int[] A=q.poll();
                int r=A[0];
                int c=A[1];
                for(int[] dir:directions){
                    int newR=dir[0]+r;
                    int newC=dir[1]+c;
                    if(newR>=0&&newR<n&&newC>=0&&newC<m&&grid[newR][newC]==1){
                        
                        q.add(new int[]{newR,newC});
                        grid[newR][newC]=0;
                        ones--;

                    }
                }
                size--;
            }
            
        }
        if(ones!=0)return -1;
        return time;


        
    }
}
