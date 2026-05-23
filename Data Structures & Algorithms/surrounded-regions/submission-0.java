class Solution {
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<n;i++){
            if(board[0][i]=='O')
                bfs(0,i,board);
        }
        for(int i=0;i<n;i++){
            if(board[m-1][i]=='O')
            bfs(m-1,i,board);
        }
        for(int i=0;i<m;i++){
            if(board[i][0]=='O')
            bfs(i,0,board);
        }
        for(int i=0;i<m;i++){
            if(board[i][n-1]=='O')
            bfs(i,n-1,board);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='1'){
                    board[i][j]='O';
                }else{
                    board[i][j]='X';
                }
            }
        }
        
    }
    public void bfs(int r,int c,char[][] board){
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{r,c});
        board[r][c]='1';
        int[][] directions={{-1,0},{1,0},{0,-1},{0,1}};
        while(!q.isEmpty()){
            int[] box=q.poll();
            r=box[0];
            c=box[1];
            for(int[] dir:directions){
                int nr=r+dir[0];
                int nc=c+dir[1];
                if(nr>=0&&nr<board.length&&nc>=0&&nc<board[0].length&&board[nr][nc]=='O'){
                    q.add(new int[]{nr,nc});
                    board[nr][nc]='1';
                }
            }
            
        }
    }
}
