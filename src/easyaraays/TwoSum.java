package easyaraays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/3/30
 * @Version: 1.0
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length<2){
            return null;
        }
        Map<Integer, Integer> map = new HashMap<>();
        int[] rs = new int[2];
        for (int i = 0; i < nums.length; i++) {
           int k = target -nums[i];
           if (map.containsKey(k)){
               rs[0]=i;
               rs[1]=map.get(k);
               return rs;
           }else {
               map.put(nums[i],i);
           }
        }
            return rs;
    }

    /**
     * 输出不符合条件,需要先进行数组拷贝,在进行两次for循环找到两个数字原来的索引
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSums(int[] nums, int target){
        if (nums.length<2){
            return null;
        }
        Arrays.sort(nums);
        int[] rs = new int[2];
        int i=0;
        int j=1;
        while (i<nums.length&&j<nums.length){
            int k=target-nums[i];
            if (nums[j]>k){
               i++;
               j++;
            }
            else if (nums[j]<k){
                j++;
            }else {
                rs[0]=i;
                rs[1]=j;
                return rs;
            }
        }
        return rs;
    }
}
