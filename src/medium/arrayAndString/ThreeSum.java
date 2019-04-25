package medium.arrayAndString;

import java.util.*;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/4/23
 * @Version: 1.0
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> rs = new ArrayList<>();
        if (nums.length == 0)
            return new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-2; i++) {
            int j = i+1;
            int len = nums.length-1;
            if (nums[i]>0)
                break;
            while (j<len){
                int sum = nums[i]+nums[j]+nums[len];
                if (sum == 0)
                    set.add(Arrays.asList(nums[i],nums[j++],nums[len--]));
                else if (sum>0)
                    len--;
                else
                    j++;
            }
        }

        return new ArrayList<>(set);

    }
}
