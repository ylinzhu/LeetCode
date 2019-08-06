package hard;

import java.util.ArrayList;
import java.util.List;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/8/1
 * @Version: 1.0
 */
public class SpiralOrder {

    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> res = new ArrayList<>();
        int row = matrix.length;
        if (row == 0 )
            return res;
        int cou = matrix[0].length;
        int num = row * cou;
        int rowIndex = 0;
        int couIndex = 0;
        int index = 1;
        while (res.size() < num  ) {
            if (index % 4 == 1) {
                for (int j = couIndex; j < cou; j++) {
                    res.add(matrix[rowIndex][j]);
                }
                rowIndex++;
                index++;
            } else if (index % 4 == 2) {
                for (int i = rowIndex; i < row; i++) {
                    res.add(matrix[i][cou -1]);
                }
                cou--;
                index++;
            } else if (index % 4 == 3) {
                for (int i = cou - 1; i >= couIndex; i--) {
                    res.add(matrix[row - 1][i]);
                }
                row --;
                index ++;
            } else {
                for (int i = row - 1; i >= rowIndex; i--) {
                    res.add(matrix[i][couIndex]);
                }
                couIndex++;
                index++;
            }
        }
        return res;
    }
}
