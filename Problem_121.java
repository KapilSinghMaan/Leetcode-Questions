// 121. Best Time to Buy and Sell Stock

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

public class Problem_121 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int low = prices[0];
        for (int i = 1; i < prices.length; i++) {
            int priceToday = prices[i] - low;
            if (priceToday > maxProfit) {
                maxProfit = priceToday;
            }
            if (prices[i] < low) {
                low = prices[i];
            }
        }
        return maxProfit;
    }
}
