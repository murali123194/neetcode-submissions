class Solution {
    public boolean isValidSudoku(char[][] board) {
        int row=0;
        int col=0;
        for(int i=0;i<9;i++){
            // row check
            Set<Character> set =new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(set.contains(board[i][j])){
                    return false;
                }else set.add(board[i][j]);
            

            }
            // column check
            Set<Character> set1 =new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[j][i]=='.') continue;
                if(set1.contains(board[j][i])) return false;
                else set1.add(board[j][i]);
            }
            // 3*3 Matrix check 
            Set<Character> set2 =new HashSet<>();
            for(int k=row;k<row+3;k++){
                for(int l=col;l<col+3;l++){
                    if(board[k][l]=='.') continue;
                    if(set2.contains(board[k][l])) return false;
                    else set2.add(board[k][l]);

                }
            }
            col=col+3;
            if(col==9){
                col=0;
                row=row+3;
            }

            
        }
        return true;
        
    }
}
