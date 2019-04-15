package easyDynamicProgramming;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/4/15
 * @Version: 1.0
 */
public class MaxProfit {

    public int maxProfit(int[] prices) {
        int minPrice =Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
              maxProfit = Math.max(maxProfit,prices[i]-minPrice);
              minPrice = Math.min(minPrice,prices[i]);
        }

        return maxProfit;
    }
}
