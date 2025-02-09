package leetcode75;

public class BuyandSellStock {

    // IMPLEMENT A logic to keep track minimum element to the lest of current
    // element; so that max profit is taken

    public int maxProfit(int[] prices) {

        int minimumPrice = prices[0];
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - minimumPrice);
            minimumPrice = Math.min(minimumPrice, prices[i]);
        }

        return maxProfit;
    }

}
