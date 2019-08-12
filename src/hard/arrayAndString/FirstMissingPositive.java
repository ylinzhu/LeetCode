package hard.arrayAndString;

import java.util.HashMap;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/8/8
 * @Version: 1.0
 */
public class FirstMissingPositive {

    /**
     *  // Mark on original array.
     *         for (int i = 0; i < numLen; i++) {
     *             int absNum = Math.abs(nums[i]);
     *             if (absNum != Integer.MAX_VALUE && absNum - 1 < numLen && nums[absNum - 1] > 0) {
     *                 nums[absNum - 1] = -nums[absNum - 1];
     *             }
     *         }
     *
     *         // Get first missing positive.
     *         for (int i = 0; i < numLen; i++) {
     *             if (nums[i] > 0) return i + 1;
     *         }
     * @param nums
     * @return
     */
    public int firstMissingPositive(int[] nums) {
        int res = 1;
        int len = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
          num = num <= 0 ? Integer.MAX_VALUE : num;
        }
        for (int i = 0; i < len; i++) {
            int temp = Math.abs(nums[i]);
            if (temp != Integer.MAX_VALUE && temp -1 <len && nums[temp -1]> 0){

            }
        }

        while (map.containsKey(res)){
            res++;
        }
        return res;
    }
}
