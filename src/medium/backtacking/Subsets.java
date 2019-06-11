package medium.backtacking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/6/11
 * @Version: 1.0
 */
public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>(16);
        List<Integer> temp = new ArrayList<>(16);
        res.add(temp);
        int len = nums.length;
        if (len <1) return res;
        for (int i = 0; i < len; i++) {
            res.add(Arrays.asList(nums[i]));
            if (res.size() > 2){
                int leni  = res.size();
                for (int j = 1; j < leni - 1; j++) {
                    temp = new ArrayList<>(res.get(j));
                    temp.add(nums[i]);
                    res.add(temp);

                }
            }

        }
        return res;

    }

    public static void main(String[] args) {
        int [] ints ={1,2,3};
        System.out.println(new Subsets().subsets(ints));
    }
}
