class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> words=new HashSet<>();
        for(String word:wordDict)words.add(word);
        int n=s.length();
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        dp[n]=0;
        int res=dfs(0,words,s,dp);
        if(res==0)return true;
        else return false;
        
    }
    private int dfs(int i,Set<String> words,String s,int[] dp){
        if(dp[i]!=-1)return dp[i];
        int res=1+dfs(i+1,words,s,dp);
        for(int j=i;j<s.length();j++){
            if(words.contains(s.substring(i,j+1))){
            res=Math.min(res,dp[j+1]);
            }
        }
        dp[i]=res;
        return res;
    } 
}
