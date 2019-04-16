package easy.easyaraays;

import java.util.*;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/3/28
 * @Version: 1.0
 */
public class Intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        int min = Math.min(nums1.length, nums2.length);
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer>map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i])){
                map.put(nums1[i],map.get(nums1[i])+1);
            }else {
                map.put(nums1[i],1);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i])&&map.get(nums2[i])>0){
                list.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i])-1);
            }
        }
        int [] rs = new int[list.size()];
        for (int i = 0; i < rs.length; i++) {
            rs[i]=list.get(i);
        }

        return rs;
    }
    /**
     * 经过排序后的优化算法,还有内存不足的提示还没有尝试,准备星期六尝试
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersectSort(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] rs = new int[Math.min(nums1.length,nums2.length)];
        int i=0;int j=0; int index=0;
        while (i<nums1.length&&j<nums2.length){
            if (nums1[i]<nums2[j]){
                i++;
            }else if (nums1[i]>nums2[j]){
                j++;
            }else {
                rs[index++]=nums1[i];
                i++;
                j++;
            }
        }
        int[] ints = Arrays.copyOf(rs, index);
        return ints;


    }
}
