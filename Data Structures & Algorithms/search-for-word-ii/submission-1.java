class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        List<String> ans =new LinkedList<>();
        int m=board.length;
        int n=board[0].length;
        for(String word:words){
            for(int i=0;i<m;i++){
                boolean flag=false;
                for(int j=0;j<n;j++){
                    if(board[i][j]==word.charAt(0)){
                        // boolean flag=false;
                        int[][] visited=new int[m][n];
                        if(dfs(board,visited,i,j,word.substring(1))){
                            ans.add(word);
                            flag=true;
                            break;
                        }
                        
                    }

                }
                if(flag)break;
            }
        }
        return ans;
    }

        private static boolean  dfs(char[][] grid,int[][] visited,int r,int c,String word){
            if(word.length()==0)return true;
            if(visited[r][c]==1)return false;
            visited[r][c]=1;
            int[][] directions={{0,-1},{0,1},{-1,0},{1,0}};
            for(int[] dir:directions){
                int R=r+dir[0];
                int C=c+dir[1];
                if(R>=0&&C>=0&&R<grid.length&&C<grid[0].length&&
                        visited[R][C]!=1&&word.charAt(0)==grid[R][C]){
                    if(dfs(grid,visited,R,C,word.substring(1)))return true;
                }
            }
            return false;



        }
        
    }

