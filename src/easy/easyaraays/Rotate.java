package easy.easyaraays;

import java.util.HashMap;
import java.util.Map;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/3/27
 * @Version: 1.0
 */
public class Rotate {
    public  void rotate(int[] nums, int k) {
        k=k%nums.length;
        int len =nums.length;
        int n=len-k;
        int []a = new int[k];
        for (int i = 0; i < k; i++) {
            a[i]=nums[n++];
        }
        for (int i = len-k-1; i >=0; i--) {
            nums[--len]=nums[i];
        }
        for (int i = 0; i < k; i++) {
            nums[i]=a[i];
        }


    }
    public  void  rotates(int []nums,int k){
        if (nums.length < 2 || k < 1 || k % nums.length == 0) {
            return;
        }
        k=k%nums.length;
        reserver(nums,0,nums.length-k-1);
        reserver(nums,nums.length-k,nums.length-1);
        reserver(nums,0,nums.length-1);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    public  void reserver(int []nums,int start,int end){
        while (start<end){
            int temp = nums[start];
            nums[start++]=nums[end];
            nums[end--] = temp;
        }
    }

    public boolean t(int[] nums){
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (map.containsKey(nums[i]))
                return false;
            map.put(nums[i],nums[i]);
        }
        return true;
    }
    /*public  boolean test(int []nums){
        boolean[] b = new boolean[nums.length];


    }*/

}
