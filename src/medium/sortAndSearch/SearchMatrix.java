package medium.sortAndSearch;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/7/3
 * @Version: 1.0
 */
public class SearchMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {

       int row = matrix.length ;
       int col = matrix[0].length ;
       if (row == 0 || col == 0) return false;
       int i = 0;
       int j = col -1;

       while (i < row && j >= 0){
           int mun = matrix[i][j];

           if (target == mun)  return true;
           else if (target > mun) i++;
           else if (target < mun) j--;

       }
       return false;

    }
}
