package hard.arrayAndString;

import java.util.HashMap;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/8/8
 * @Version: 1.0
 */
public class FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {
        int res = 1;
        int len = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,num);
        }
        while (map.containsKey(res)){
            res++;
        }
        return res;
    }
}
