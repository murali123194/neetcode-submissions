class Solution {
    public void setZeroes(int[][] matrix) {
        Queue<int[]> pq=new LinkedList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0)pq.add(new int[]{i,j});
            }
        }
        while(!pq.isEmpty()){
            int[] A=pq.poll();
            int r=A[0];
            int c=A[1];
            for(int i=0;i<n;i++){
                matrix[r][i]=0;
            }
            for(int i=0;i<m;i++){
                matrix[i][c]=0;

            }
        }


        
    }
}
