class Solution {
    public int maxProfit(int[] prices) {
        int[][] memo=new int[prices.length+1][2];
        for(int[] num:memo){
            Arrays.fill(num,-1);
        }
        return recursion(prices,0,1,memo);



        
        
    }
    private int recursion(int[] prices,int idx,int buy,int[][] memo){
        if(idx>=prices.length)return 0;
        if(memo[idx][buy]!=-1)return memo[idx][buy];
        // Skip 
        int skip=recursion(prices,idx+1,buy,memo);

        // Buy or Sell
        int notskip=Integer.MIN_VALUE;
        if(buy==1){
            // amount=-prices[idx];
            notskip=-prices[idx]+recursion(prices,idx+1,0,memo);


        }
        else {
            // amount+=prices[idx];
            notskip=prices[idx]+recursion(prices,idx+2,1,memo);
        }
        return Math.max(skip,notskip);

    }
}
