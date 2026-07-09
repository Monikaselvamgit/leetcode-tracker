// Last updated: 7/9/2026, 9:44:53 AM
class Solution {
    public int maxProfit(int[] prices) {
        int minprice=prices[0];
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minprice){
                minprice=prices[i];
            }
            int profit=prices[i]-minprice;
            if(profit>maxprofit){
                maxprofit=profit;
            }
        }
        return maxprofit;
    }
}