package easy.easyother;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/4/22
 * @Version: 1.0
 */
public class HammingDistance {

    public static int hammingDistance(int x, int y) {
        int m = x ^ y;
        int cnt = 0;
        for (int i = 0; i < 32; i++){
            if ((m & 1) == 1) {
                cnt++;
            }
            m >>= 1;
        }
        return cnt;
    }

    public static void main(String[] args) {
        hammingDistance(4,8);
    }
}
