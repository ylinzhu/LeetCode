package medium.sortAndSearch;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/6/27
 * @Version: 1.0
 */
public class Merge {

    public static int[][] merge(int[][] intervals) {
        if(intervals.length<2)
            return intervals;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] i1, int[] i2) {
                return i1[0] - i2[0];
            }
        });
        int j = 0;
        for (int i=1; i<intervals.length; i++) {
            if(intervals[i][0] <= intervals[j][1])
                intervals[j][1] = Math.max(intervals[j][1], intervals[i][1]);
            else {
                j++;
                intervals[j][0] = intervals[i][0];
                intervals[j][1] = intervals[i][1];
            }
        }
        int[][] ans = new int[j+1][2];
        for(int i=0;i<=j;i++) {
            for(int k=0;k<2;k++) {
                ans[i][k] = intervals[i][k];
            }
        }
        return ans;
    }
}
