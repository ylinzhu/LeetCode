package easyDynamicProgramming;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/4/15
 * @Version: 1.0
 */
public class MaxSubArray {
    int max =Integer.MIN_VALUE;
    int Max =0;
    public int maxSubArray(int[] nums) {
        for (int num : nums) {
             max = Math.max(max,num);


        }
        if (max<=0)
            return max;
        return Max;
    }
}
