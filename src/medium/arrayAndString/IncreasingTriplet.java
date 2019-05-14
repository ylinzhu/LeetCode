package medium.arrayAndString;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/5/14
 * @Version: 1.0
 */
public class IncreasingTriplet {

    public static boolean increasingTriplet(int[] nums) {
        int len = nums.length;
        if (len < 2) return false;
         int a =Integer.MAX_VALUE;
         int b =Integer.MAX_VALUE;

        for (int num : nums) {
          if (num < a) a = num;
          else if (num > a && num < b) b = num;
          else if (num >a && num > b) return true;

        }
        return false;
    }


}
