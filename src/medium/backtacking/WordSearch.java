package medium.backtacking;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/6/11
 * @Version: 1.0
 */
public class WordSearch {

    public boolean find(char[][] board,boolean[][] flag, String word, int i, int j, int index) {
        if (index == word.length()) return true;
        if (board[i][j] == word.charAt(index) && flag[i][j] == false) {
            index++;
            flag[i][j] = true;

            //i+1
            int a = i == board.length -1 ? 0 : i + 1;
            //i -1
            int b = i == 0 ? board.length -1  : i -1 ;
            //j+1
            int c = j ==  board[0].length -1 ? 0 : j+1;
            //j-1
            int d = j == 0 ? board[0].length -1  : j -1 ;
           return find(board,flag, word, a, j, index) ||  find(board,flag, word, b, j , index) ||  find(board,flag, word, i , c, index) || find(board,flag, word, i, d, index);
        }else {

            return false;
        }
}

    public boolean exist(char[][] board, String word) {
        if (board.length == 0) return false;
        int cro = board.length;
        int ver = board[0].length;
        if (cro * ver <word.length()) return false;
        for (int i = 0; i < cro; i++) {
            for (int j = 0; j < ver; j++) {
                     boolean[][] flag = new boolean[cro][ver];
                    if (find(board, flag,word, i, j, 0))
                        return true;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        char[][] board =  {{'C','A','A'},
                            {'A','A','A'},
                            {'B','C','D'}};
        System.out.println(new WordSearch().exist(board, "AAB"));

    }

}
