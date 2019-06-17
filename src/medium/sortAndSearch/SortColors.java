package medium.sortAndSearch;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/6/14
 * @Version: 1.0
 */
public class SortColors {

    public static void sortColors(int[] nums) {
        int len = nums.length;
        if (len < 2) return ;
        int index = 0;
        /**
         * 这个也行
         */
        /*int end = len - 1 ;
        int start = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 0 ){
                nums[i] = nums[start];
                nums[start++] = 0;
            }
            else if (nums[i] == 2){
                nums[i--] = nums[end];
            if (start == end  ) return nums;
                nums[end --] = 2;
            }
            if (start == end || i == end ) return nums;
        }*/

        char[] temp = new char[2];
        for (int i = 0; i < len; i++) {
            temp[nums[i]]++;
        }
        int i = 0;
        while (index <len) {
            if (nums[i] != 0){
                nums[index++] = i;
                temp[i]--;
            }else {
                i++;
            }
        }
    }
}
