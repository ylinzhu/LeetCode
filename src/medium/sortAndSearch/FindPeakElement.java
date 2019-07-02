package medium.sortAndSearch;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/6/17
 * @Version: 1.0
 */
public class FindPeakElement {


    public int findPeakElement(int[] nums) {
        int len = nums.length;
        if (len < 2 ) return 0;
        if (len == 2){
            return nums[0] > nums[1] ? 0:1;
        }
        int front = nums[0];
        int rear =  nums[0];
        int index = 0;
        for (int i = 1; i < len ; i++) {
            if ((rear =Math.max(rear,nums[i])) == nums[i]) index = i;
            if (i == len -1 )return index;
            if (front < nums[i] && nums[i] > nums[i + 1]) {
                return i;
            }


            front = nums[i];
        }
        return index;
    }
}
