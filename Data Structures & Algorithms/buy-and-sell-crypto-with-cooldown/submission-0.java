class Solution {
    public int maxProfit(int[] prices) {
        return recursion(prices,0,true,0);


        
        
    }
    private int recursion(int[] prices,int idx,boolean buy,int amount){
        if(idx>=prices.length)return 0;
        // Skip 
        int skip=recursion(prices,idx+1,buy,amount);

        // Buy or Sell
        int notskip=Integer.MIN_VALUE;
        if(buy){
            // amount=-prices[idx];
            notskip=-prices[idx]+recursion(prices,idx+1,!buy,amount);


        }
        else {
            // amount+=prices[idx];
            notskip=prices[idx]+recursion(prices,idx+2,!buy,0);
        }
        return Math.max(skip,notskip);

    }
}
