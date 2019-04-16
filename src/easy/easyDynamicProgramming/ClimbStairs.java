package easy.easyDynamicProgramming;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/4/15
 * @Version: 1.0
 */
public class ClimbStairs {
    /**
     * 不能使用递归,必须符合动态规划的特点,递归会超时
     * @param n
     * @return
     */
    public static   int climbStairs(int n) {
        if (n<=2)
            return n;
        int a=1;
        int rs =2;
        for (int i = 3; i <= n; i++) {
            rs+=a;
            a=rs-a;

        }
        return rs;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }

}
