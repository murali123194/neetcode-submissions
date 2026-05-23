class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(backTrack(board,word,i,j,0))return true;
            }
        }
        return false;
        
        
    }
    public boolean backTrack(char[][] board,String word ,int r,int c,int idx){
        if(idx==word.length()){
            return true;
        }
        // Other base conditions 
        // If it is out of the bound
        if(r<0||c<0||r>=board.length||c>=board[0].length)return false;
        // If the current element of the board is not equal to the word[idx] 
        // then no need to explaore that cell 
        if(board[r][c]!=word.charAt(idx))return false;
        // Mark the exploring cell as visited ,so its children wont call it again (up/down/r/left)
        char temp=board[r][c];
        board[r][c]='#';
        boolean result=(backTrack(board,word,r,c-1,idx+1)||
                        backTrack(board,word,r,c+1,idx+1)||
                        backTrack(board,word,r-1,c,idx+1)||
                        backTrack(board,word,r+1,c,idx+1));
        board[r][c]=temp;
        return result;




    }
}
