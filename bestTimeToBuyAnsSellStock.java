
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

import java.lang.Math;

public class bestTimeToBuyAnsSellStock {

    public int maxProfit(int[] prices) {
        int minElementSoFar = prices[0];
        int maxProfitSoFar = 0;

        for (int i = 1; i < prices.length; i++) {
            if (minElementSoFar > prices[i]) {
                minElementSoFar = prices[i];
            } else {
                maxProfitSoFar = Math.max(maxProfitSoFar, prices[i] - minElementSoFar);
            }
        }

        return maxProfitSoFar;
    }
}
