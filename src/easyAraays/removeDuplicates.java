package easyAraays;

/**
 * @Designation:数组去重
 * @Author: Ylz
 * @Version: 1.0
 */
public class removeDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length <2)
            return nums.length;
        int length = nums.length;
        int k = 0;
        for (int i = 0; i < length-1; i++) {
            if (nums[i] != nums[i+1])
                   nums[++k] = nums[i+1];
        }
        return ++k;
    }
}
