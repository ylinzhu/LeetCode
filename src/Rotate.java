/**
 * @Designation:
 * @Author: Yuanlinzhu
 * @Date: 2019/3/27 19:46
 * @Version: 1.0
 */
public class Rotate {
    public void  rotate(int[] nums ,int k){
        int len=nums.length;
        int[] a = new int[len];
        int j=0;
        for (int i=len-k;i<k;i++){
            a[j++]=nums[i];
        }
        for (int i=0;i<len-k;i++){
            a[j++]=nums[i];
        }
        nums=a;

    }
}
