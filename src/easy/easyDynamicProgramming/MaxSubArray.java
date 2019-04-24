package easy.easyDynamicProgramming;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/4/15
 * @Version: 1.0
 */
public class MaxSubArray {


    public int maxSubArray(int[] nums) {
        int max =nums[0];
        int Max =nums[0];

        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max+nums[i],nums[i]);
            Max = Math.max(Max,max);
        }
        return Max;
    }
}
