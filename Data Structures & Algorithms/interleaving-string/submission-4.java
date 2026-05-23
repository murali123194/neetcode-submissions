class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()+s2.length()!=s3.length())return false;
        int[][] memo=new int[s1.length()][s2.length()];
        for(int[] num:memo){
            Arrays.fill(num,-1);
        }

        return interL(s1,s2,s3,0,0,memo)==1;
        
        
    }
    private int interL(String s1,String s2,String s3,int i,int j,int[][] memo){
        int m=s1.length();
        int n=s2.length();
        int k=s3.length();
        
        if(i==m&&j==n&&i+j==k)return 1;
        if(i<m&&j<n&&memo[i][j]!=-1)return memo[i][j];
        // If only one String Contributes ,then 
        
        
        int interLeave=0;
        if(i<m&&s1.charAt(i)==s3.charAt(i+j)){
            interLeave=interL(s1,s2,s3,i+1,j,memo);
        }
        if(interLeave==1)return  1;
        if(j<n&&s2.charAt(j)==s3.charAt(i+j)){
            interLeave=interL(s1,s2,s3,i,j+1,memo);
        }
        if(i<m&&j<n)return memo[i][j]=interLeave;
        return interLeave;


    }
}
