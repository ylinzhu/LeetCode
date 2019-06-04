package medium.treeAndGraphs;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/6/4
 * @Version: 1.0
 */
public class NumIslands {

    public  void find(int i, int j, char[][] grid) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) return;
        if (grid[i][j] == '0')
            return;
        grid[i][j] = '0';
        find(i + 1, j, grid);
        find(i - 1, j, grid);
        find(i, j + 1, grid);
        find(i, j - 1, grid);
    }

    public  int numIslands(char[][] grid) {
        int res = 0;
        if ( grid == null) {
            return res;
        }

        for (int i = 0; i < grid.length; i++) {
            for (int y = 0; y < grid[i].length; y++) {
                if (grid[i][y] == '1' ) {
                    find(i,y,grid);
                    res++;
                }
            }
        }
        return res;
    }
}
