import java.util.HashMap;
import java.util.Map;

/**
 * @Designation:
 * @Author: Yuanlinzhu
 * @Date: 2019/3/28 19:37
 * @Version: 1.0
 */
public class Intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        int min = Math.min(nums1.length, nums2.length);
        int [] rs = new int[min];
        int k=0;
        if (min == nums1.length){
            for (int i = 0; i < nums1.length; i++) {
                for (int i1 = 0; i1 < nums2.length; i1++) {
                    if (nums1[i]==nums2[i1]){
                        rs[k++]=nums1[i];

                    }
                }
            }

        }else {

        }
        return rs;
    }
}
