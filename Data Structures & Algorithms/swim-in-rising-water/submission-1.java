class Solution {
    public int swimInWater(int[][] grid) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] visited=new boolean[n][m];

        pq.add(new int[]{grid[0][0],0,0});
        // visited[0][0]=true;
        int[][] directions={{0,-1},{0,1},{1,0},{-1,0}};
        while(!pq.isEmpty()){
            int[] A=pq.poll();
            int time=A[0];
            int r=A[1];
            int c=A[2];
            // if(r==n-1&&c==m-1)return time;
            if(visited[r][c])continue;
            visited[r][c]=true;
            for(int[] dir:directions){
                int R=dir[0]+r;
                int C=dir[1]+c;
                if(R>=0&&R<n&&C>=0&&C<m&&!visited[R][C]){
                    // visited[R][C]=true;
                    pq.add(new int[]{(int)Math.max(time,grid[R][C]),R,C});
                    if(R==n-1&&C==m-1)return Math.max(time,grid[R][C]);
                }
            }
            
        }
        return -1;

    }
}
