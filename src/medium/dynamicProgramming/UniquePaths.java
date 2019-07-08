package medium.dynamicProgramming;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/7/5
 * @Version: 1.0
 */
public class UniquePaths {

    public int uniquePaths(int m, int n) {
        if (m < 2|| n <2)return 1;
        int[][] dp = new int[m][n];
        for (int i = m -1; i >= 0; i--) {
            for (int j = n -1; j >= 0; j--) {
                if (i == m -1||j==n -1) dp[i][j] = 1;
                else dp[i][j] = dp[i+1][j] + dp[j][i+1];
            }
        }
        return dp[0][0];
    }
}
