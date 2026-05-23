class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        // int[] ans=new int[m*n];
        List<Integer> ans=new ArrayList<>();
        int totalNumbers=m*n;
        int downColumn=n;
        int rightRow=0;
        int upColumn=0;
        int leftRow=m;
        int time=0;
        while(totalNumbers>0){
            if(time%4==0){
                for(int i=upColumn;i<downColumn;i++){
                    ans.add(matrix[rightRow][i]);
                    totalNumbers--;
                }
                
                rightRow++;
            }
            else if(time%4==1){
                for(int i=rightRow;i<leftRow;i++){
                    ans.add(matrix[i][downColumn-1]);
                    totalNumbers--;
                }
                downColumn--;
            }
            else if(time%4==2){
                for(int i=downColumn-1;i>=upColumn;i--){
                    ans.add(matrix[leftRow-1][i]);
                    totalNumbers--;
                }
                leftRow--;
            }
            else if(time%4==3){
                for(int i=leftRow-1;i>=rightRow;i--){
                    ans.add(matrix[i][upColumn]);
                    totalNumbers--;
                }
                upColumn++;
            }
            time++;

        }
        return ans;
        
    }
}
