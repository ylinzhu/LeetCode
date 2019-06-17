package medium.backtacking;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/6/11
 * @Version: 1.0
 */
public class WordSearch {

    public boolean find(char[][] board, char[] word, int i, int j, int index) {
        if (i < 0 || j< 0 || i == board.length || j == board[0].length) return false;
        if (board[i][j] != word[index] ) return false;
        if (index == word.length - 1 ) return true;

        board[i][j] ^= 256;
        boolean res = find(board, word, i + 1, j, index + 1)
                || find(board, word, i - 1, j, index + 1)
                || find(board, word, i, j + 1, index + 1)
                || find(board, word, i, j - 1, index + 1);
        board[i][j] ^= 256;
        return res;
}
    public boolean exist(char[][] board, String word) {
        if (board.length == 0) return false;
        char[] chars = word.toCharArray();
        int cro = board.length;
        int ver = board[0].length;
        if (cro * ver <word.length()) return false;

        for (int i = 0; i < cro; i++) {
            for (int j = 0; j < ver; j++) {
                    if (find(board,chars, i, j, 0))
                        return true;
            }
        }
        return false;

    }

    public boolean exists(char[][] board, String word) {
        char[] w = word.toCharArray();
        for (int y=0; y<board.length; y++) {
            for (int x=0; x<board[y].length; x++) {
                if (exist(board, y, x, w, 0)) return true;
            }
        }
        return false;
    }

    private boolean exist(char[][] board, int y, int x, char[] word, int i) {
        if (i == word.length) return true;
        if (y<0 || x<0 || y == board.length || x == board[y].length) return false;
        if (board[y][x] != word[i]) return false;
        board[y][x] ^= 256;
        boolean exist = exist(board, y, x+1, word, i+1)
                || exist(board, y, x-1, word, i+1)
                || exist(board, y+1, x, word, i+1)
                || exist(board, y-1, x, word, i+1);
        board[y][x] ^= 256;
        return exist;
    }


    public static void main(String[] args) {
        char[][] board =  {
                {'a','a','a'},
                {'a','b','b'},
                {'a','b','b'},
                {'b','b','b'},
                {'b','b','b'},
                {'a','a','a'},
                {'b','b','b'},
                {'a','b','b'},
                {'a','a','b'},
                {'a','b','a'}};
        System.out.println(new WordSearch().exist(board, "aabaaaabbb"));
        System.out.println(new WordSearch().exists(board, "aabaaaabbb"));

    }

}
