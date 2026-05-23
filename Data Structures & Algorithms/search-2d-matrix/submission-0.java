class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        int c=matrix[0].length;
        for(int i=0;i<r;i++){
            if(target>=matrix[i][0]&&target<=matrix[i][c-1]){
                for(int j=0;j<c;j++){
                int low=0;
                int high=c-1;
                while(low<=high){
                    int mid=low+(high-low)/2;
                    if(target==matrix[i][j]){
                        return true;
                    }
                    if(target>matrix[i][j]){
                        low=mid+1;
                    }else{
                        high =mid-1;
                    }
                }
                }
            }
        }
        return false;
        
    }
}
