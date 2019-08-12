package hard.arrayAndString;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/8/8
 * @Version: 1.0
 */
public class LongestConsecutive {


    public static int longestConsecutive(int[] nums) {
        int res = 1;
        int temp = 1;
        if (nums.length == 0) return res;
        Arrays.sort(nums);
        int i = nums[0];
        for (int num : nums) {
            int k = num;
            if (i +1 == k){
                temp++;
            }else if (i == k){
            }else {
                temp = 1;
            }
            i = k;
           res =  Math.max(temp,res);
        }
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int num : nums) {
//            map.put(num,num);
//        }
//        for (int num : nums) {
//            int index= 0;
//            while (map.containsKey(num++)){
//                index++;
//            }
//            res = Math.max(index,res);
//        }
        return res;
    }
}
