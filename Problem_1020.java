// 1020. Number of Enclaves

// https://leetcode.com/problems/number-of-enclaves/description/

public class Problem_1020 {

    int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

    public void dfs(int[][] grid, int r, int c, int n, int m) {
        if (r < 0 || r >= n || c < 0 || c >= m || grid[r][c] != 1) {
            return;
        }
        grid[r][c] = 0;
        for (int[] d : dirs) {
            dfs(grid, r + d[0], c + d[1], n, m);
        }
    }

    public int numEnclaves(int[][] grid) {

        if (grid == null || grid.length == 0) {
            return 0;
        }

        int n = grid.length;
        int m = grid[0].length;

        for (int i = 0; i < n; i++) {
            if (grid[i][0] == 1) {
                dfs(grid, i, 0, n, m);
            }
            if (grid[i][m - 1] == 1) {
                dfs(grid, i, m - 1, n, m);
            }
        }
        for (int i = 0; i < m; i++) {
            if (grid[0][i] == 1) {
                dfs(grid, 0, i, n, m);
            }
            if (grid[n - 1][i] == 1) {
                dfs(grid, n - 1, i, n, m);
            }
        }

        int enclaves = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    enclaves++;
                }
            }
        }

        return enclaves;
    }
}