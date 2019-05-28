package medium.arrayAndString;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/4/25
 * @Version: 1.0
 */
public class SetZeroes {

    public void setZeroes(int[][] matrix) {
        int rows =matrix.length;
        int cols=matrix[0].length;

        boolean row =false;
        boolean col =false;

        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0)
                row =true;
            for (int i1 = 1; i1 < cols; i1++) {
                if (matrix[i][i1] == 0){
                    matrix[i][0]=matrix[0][i1] = 0;
                }
            }
        }

        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 1; j--)
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            if (row) matrix[i][0] = 0;
        }


    }
}
