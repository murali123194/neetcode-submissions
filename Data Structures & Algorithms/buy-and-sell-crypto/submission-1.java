class Solution {
    public int maxProfit(int[] prices) {
        int left=0;
        int right=1;
        int n=prices.length;
        int profit=0;
        while(right<n){
            if(prices[right]<prices[left]){
                left=right;
            }else{
                profit=Math.max(profit,prices[right]-prices[left]);
                };
            right++;
            



        }
        return profit;
        
    }
}
