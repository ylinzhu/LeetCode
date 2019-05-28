package easy.easyDynamicProgramming;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/4/15
 * @Version: 1.0
 */
public class Rob {

    public int rob(int[] nums) {
        int prevOne=0;
        int prevTwo =0;
        for (int num : nums) {
            int temp =prevOne;
            prevOne = Math.max(prevOne,prevTwo);
            prevTwo = num+temp;
        }
        return  Math.max(prevOne,prevTwo);
    }
}
