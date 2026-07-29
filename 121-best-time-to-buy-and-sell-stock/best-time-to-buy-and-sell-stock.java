class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            int currentPrice = prices[i];
            
            minPrice = Math.min(minPrice, currentPrice);
            
            int todayProfit = currentPrice - minPrice;
            
            maxProfit = Math.max(maxProfit, todayProfit);
        }
        
        return maxProfit;
    }
}