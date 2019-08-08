package hard.arrayAndString;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/8/7
 * @Version: 1.0
 */
public class GameOfLife {

    private static void changeLifeSatus(int[][] board, int m, int n, int maxRow, int maxCou){
        int status = 0;
        if (m > 0 && m < maxCou && n>0 && n<maxRow){
            status+= board[m-1][n];
            status+= board[m+1][n];
            status+= board[m+1][n+1];
            status+= board[m+1][n-1];
            status+= board[m-1][n+1];
            status+= board[m-1][n-1];
            status+= board[m][n+1];
            status+= board[m][n-1];
        }
    }

    /**
     *  [0,1,0],
     *   [0,0,1],
     *   [1,1,1],
     *   [0,0,0]
     * @param board
     */
    public void gameOfLife(int[][] board) {
        //3原来为1,最后死亡,2原来为0,最后为1
        if (board == null || board.length == 0) {
            return;
        }



    }

}
