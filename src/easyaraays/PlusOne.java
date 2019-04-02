package easyaraays;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/3/29
 * @Version: 1.0
 */
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length-1; i>= 0; i--) {
            digits[i] += carry;
            if (digits[i] <= 9)
                return digits;
            digits[i] = 0;
        }
        int[] ret = new int[digits.length+1];
        ret[0] = 1;
        return ret;
    }
}
