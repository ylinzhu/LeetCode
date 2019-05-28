package medium.arrayAndString;

import java.util.ArrayList;
import java.util.List;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/5/13
 * @Version: 1.0
 */
public class MissingRange {
//[0, 1, 3, 50, 75], lower = 0 and upper = 99,
    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> res = new ArrayList<>();
        if (nums.length<2)
            return res;
        int len = nums.length;
        int next = lower;
        boolean flag = false;
        for (int i = 0; i < len; i++) {
            if (lower == Integer.MAX_VALUE) return res;
            if (nums[i] < next){
                continue;
            }
            if (nums[i] == next){
                next++;
                continue;
            }
            res.add(getRange(next,nums[i]-1));
            if (nums[i] == Integer.MAX_VALUE) return res;
            next = nums[i]+1;

        }
        if (nums[len-1]<upper){
            res.add(getRange(nums[len-1]+1,upper));
        }
        return res;


    }
    public static String getRange(int val1,int val2){
        return val1 == val2 ? String.valueOf(val1):String.format("%d->%d",val1,val2);
    }

    public static void main(String[] args) {
        int[] ints ={0, 1, 3, 50, 75};
        System.out.println(findMissingRanges(ints, 0, 99));
    }
}
