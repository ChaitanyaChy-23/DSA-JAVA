class Solution {
    public int maxProfit(int[] prices) {
        int profit =0;
        int minCost = prices[0];

        for(int i =0;i<prices.length;i++){
            int currentprofit = prices[i]-minCost;
            profit = Math.max(currentprofit,profit);

            minCost = Math.min(minCost,prices[i]);
        }
    return profit;
    }
}