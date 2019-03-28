/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/3/28
 * @Version: 1.0
 */
public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        if (nums.length<2){
            return;
        }
        int len = nums.length;
        int num =0;
        int index=0;
        for (int i = 0; i < len; i++) {
            if (nums[i]!= 0){
                nums[index++]=nums[i];
            }else {
                num++;
            }
        }
        for (int i = len-1; i >len-num-1; i--) {
            nums[i]=0;
        }

    }

    public static void main(String[] args) {
        int[] a={0,1};
        moveZeroes(a);
    }
}
