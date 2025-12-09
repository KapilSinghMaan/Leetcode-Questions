// 934. Shortest Bridge

// https://leetcode.com/problems/shortest-bridge/description/

import java.util.LinkedList;
import java.util.Queue;

public class Problem_934 {

    int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
    boolean found = false;

    private void dfs(int[][] grid, int r, int c, Queue<int[]> q) {
        int n = grid.length;
        if (r < 0 || r >= n || c < 0 || c >= n || grid[r][c] != 1) {
            return;
        }

        grid[r][c] = 2;
        q.offer(new int[] { r, c });

        for (int[] dir : dirs) {
            dfs(grid, r + dir[0], c + dir[1], q);
        }
    }

    public int shortestBridge(int[][] grid) {
        int n = grid.length;
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < n && !found; i++) {
            for (int j = 0; j < n && !found; j++) {
                if (grid[i][j] == 1) {
                    dfs(grid, i, j, q);
                    found = true;
                }
            }
        }

        int steps = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            while (size-- > 0) {
                int[] cell = q.poll();
                int r = cell[0];
                int c = cell[1];

                for (int[] dir : dirs) {
                    int nr = r + dir[0];
                    int nc = c + dir[1];

                    if (nr >= 0 && nr < n && nc >= 0 && nc < n) {
                        if (grid[nr][nc] == 1) {
                            return steps;
                        }

                        if (grid[nr][nc] == 0) {
                            grid[nr][nc] = 2;
                            q.offer(new int[] { nr, nc });
                        }
                    }
                }
            }
            steps++;
        }
        return -1;
    }
}
