package hard;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/8/6
 * @Version: 1.0
 */
public class MaxArea {

    public int maxArea(int[] height) {
        int res = 0;
        int end = height.length -1;
        int start = 0;
        while (start < end) {
            int min = Math.min(height[start], height[end]);
            res = Math.max(res, min*(end - start));
            if (height[start] > height[end]) end--;
            else start++;
        }

        return res;
    }
}
