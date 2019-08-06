package hard.arrayAndString;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/8/1
 * @Version: 1.0
 */
public class ProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int number = 0;
        int index = -1;
        int total = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                index = i;
                if (++number > 1)
                    return res;
            } else {
                total *= nums[i];
            }
        }
        if (number == 1){
            res[index] = total;
            return res;
        }
        for (int i = 0; i < nums.length; i++) {
            res[i] = total / nums[i];
        }
        return res;
    }

    public static int[] productExceptSelfs(int[] nums) {
        int[] leftdp = new int[nums.length];
        int[] rightdp = new int[nums.length];

        leftdp[0] = 1;
        rightdp[nums.length - 1] = 1;
        rightdp[nums.length - 1] = 1;
        for (int i = 1; i < nums.length; i++) {

            leftdp[i] = leftdp[i - 1] * nums[i - 1];
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            rightdp[i] = rightdp[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = leftdp[i] * rightdp[i];
        }
        return nums;
    }


    public static void main(String[] args) {
        int[] ints = {1, 0, 3, 5, 78, 5, 3};
        System.out.println(productExceptSelfs(ints));
    }
}
