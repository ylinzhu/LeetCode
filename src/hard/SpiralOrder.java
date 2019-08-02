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

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                res.add(matrix[i][j]);
            }
        }
    }
}
