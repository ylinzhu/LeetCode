package easyAraays;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/4/1
 * @Version: 1.0
 */
public class RotateImage {
    public static void rotate(int[][] matrix) {
            int len =matrix.length;
            int lenth=len-1;
        /**
         * 1  2  3
         * 4  5  6
         * 7  8  9
         *
         * 7  4  1
         * 8  5  2
         * 9  6  3
         */
        int start =0;
        while (start*2<lenth){
            for (int i = 0; i < len-i; i++) {
                int temp1=matrix[i][lenth-start];
                matrix[i][lenth-start]=matrix[start][i];
                int temp2 = matrix[lenth-start][lenth-i];
                matrix[lenth-start][lenth-i] = temp1;
                int temp3 = matrix[lenth-i][start];
                matrix[lenth-i][start] = temp2;
                matrix[start][i] =temp3;
            }
                start++;
        }

    }


}
