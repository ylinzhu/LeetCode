package easy.easyaraays;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/3/27
 * @Version: 1.0
 */
public class MaxProfit {
    public int maxProfit(int[] prices) {
        int result = 0;
        int length = prices.length;
        if (length < 2) {
            return result;
        }
        for (int i = 0; i < length - 1; i++) {
            if (prices[i] < prices[i + 1])
                result += prices[i + 1] - prices[i];
        }
        return result;
    }
}
