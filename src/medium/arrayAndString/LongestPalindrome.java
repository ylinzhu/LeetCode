package medium.arrayAndString;


/**
 * @Designation:dymic programing
 * @Author: Ylz
 * @Date: 2019/4/30
 * @Version: 1.0
 */
public class LongestPalindrome {
    public String longestPalindrome(String s) {
        if (s.length() < 2)
            return s;
        String res = "";
        int len = s.length();
        boolean[][] dp = new boolean[len][len];

        for (int i = len  -1 ; i >= 0; i--) {
            for (int j = i; j < len; j++) {
                if (s.charAt(i) == s.charAt(j)&&( i+1>j-1||dp[i+1][j-1] == true)){
                    if (res.length() < j-i+1){
                        res =s.substring(i,j+1);
                    }
                        dp[i][j] =true;
                }
            }
        }
            return res;
    }
}
