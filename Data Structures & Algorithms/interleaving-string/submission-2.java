class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()+s2.length()!=s3.length())return false;
        return interL(s1,s2,s3,0,0);
        
        
    }
    private boolean interL(String s1,String s2,String s3,int i,int j){
        int m=s1.length();
        int n=s2.length();
        int k=s3.length();
        
        if(i==m&&j==n&&i+j==k)return true;
        
        // If only one String Contributes ,then 
        
        
        boolean interLeave=false;
        if(i<m&&s1.charAt(i)==s3.charAt(i+j)){
            interLeave=interL(s1,s2,s3,i+1,j);
        }
        if(j<n&&s2.charAt(j)==s3.charAt(i+j)){
            interLeave=interL(s1,s2,s3,i,j+1);
        }
        return interLeave;


    }
}
