package hard.arrayAndString;

import java.util.Arrays;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/8/8
 * @Version: 1.0
 */
public class FindDuplicate {

    /**
     * [1,3,4,2,2]
     */
    //todo 查看链表环的做法
    public int findDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int slow = nums[0];
        int fast = nums[0];

        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if (slow == fast) {
                fast = nums[0];
                while (fast != slow){
                    slow = nums[slow];
                    fast = nums[fast];
                }
                return  fast;
            }
        }


    }
}
