class Solution {
    public int findJudge(int n, int[][] trust) {
        int ans=-1;
        if(trust.length==1)return trust[0][1];
        for(int i=1;i<trust.length;i++){
            if(trust[i][1]!=trust[i-1][1])return -1;
            else {
                ans=trust[i][1];
            }
        }
        return ans;
        

        
    }
}