package easyaraays;

import java.util.HashSet;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/3/30
 * @Version: 1.0
 */
public class IsValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        HashSet set = new HashSet();
        for (int i=0;i<9;i++){
            for (int j =0 ;j<9; j++){
                char c = board[i][j];
                if (c!= '.')
                    if (!set.add(c+"in row"+i)||!set.add(c+"in colum"+j)||!set.add(c+"in blok"+i/3+"-"+j/3))
                        return false;
            }
        }
        return true;
    }
}
