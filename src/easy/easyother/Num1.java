package easy.easyother;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/4/18
 * @Version: 1.0
 */
public class Num1 {
    public static int hammingWeight(int n) {
        int index =0;

        for (int i = 0; i < 32; i++) {
            index+=n&1;
            n>>>=1;
        }
        return index;
    }
}
