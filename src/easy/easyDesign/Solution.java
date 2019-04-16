package easy.easyDesign;

import java.util.Random;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/4/16
 * @Version: 1.0
 */
public class Solution {
    Random random;
    int[] oraginal;
    int[] nums;

    public Solution(int[] nums) {
        this.nums = nums;
        oraginal = nums.clone();
        random = new Random();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
         return oraginal;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        for (int i = 0; i < nums.length; i++) {
            int temp = random.nextInt(nums.length-i);
            int tmp = nums[temp+i];
            nums[temp+i] = nums[i];
            nums[i] = tmp;
        }
        return nums;
    }
}
