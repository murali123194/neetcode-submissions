class Solution {

    public String longestPalindrome(String s) {
        int n=s.length();
        int[][] memo=new int[n][n];
        for(int[] row:memo){
            Arrays.fill(row,-1);
        }
        int max=0;
        int startPoint=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(palin(s,i,j,memo)==1){
                    if(j-i+1>max){
                        max=j-i+1;
                        startPoint=i;
                    }
                }
            }
        }
        return s.substring(startPoint,max+startPoint);
        
        
        
        

        
    }
    private int  palin(String s,int i,int j,int[][] memo){
        if(i>=j)return 1;
        if(s.charAt(i)!=s.charAt(j))return 0;
        if(memo[i][j]!=-1)return memo[i][j];
        return memo[i][j]=palin(s,i+1,j-1,memo);
    }

     
}
