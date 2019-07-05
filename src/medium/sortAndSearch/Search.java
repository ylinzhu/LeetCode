package medium.sortAndSearch;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/7/3
 * @Version: 1.0
 */
public class Search {

    public static int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = (l+r) >> 1;
            if (target == nums[mid])return mid;
            if (nums[mid] < nums[r]){
                if (target > nums[mid] && target <= nums[r]) l = mid + 1;
                else r = mid - 1;
            }else if (nums[mid] > nums[r]){
                if (target >= nums[l] && target <= nums[mid])
                    r = mid -1;
                else  l = mid + 1;
            }else return -1;

        }
        return -1;
    }

    public static void main(String[] args) {
    }
}
