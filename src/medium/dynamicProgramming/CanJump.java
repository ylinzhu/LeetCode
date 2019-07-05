package medium.dynamicProgramming;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/7/3
 * @Version: 1.0
 */
public class CanJump {

    public static boolean canJump(int[] nums) {
        int lenth = nums.length ;
        int max = 0;
        for (int i = 0; i < lenth -1; i++) {
            if (nums[i] >= lenth - i -1)return true;
            max = Math.max(max - 1, nums[i]);
            if (max <= 0) return false;
        }
        return true;
    }
}
