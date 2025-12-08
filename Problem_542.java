// 542. 01 Matrix

// https://leetcode.com/problems/01-matrix/description/

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Problem_542 {

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }

    public int[][] updateMatrix(int[][] mat) {
        int[][] dist = new int[mat.length][mat[0].length];

        for (int i = 0; i < dist.length; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }

        Queue<Point> q = new LinkedList<>();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0) {
                    dist[i][j] = 0;
                    q.add(new Point(i, j));
                }
            }
        }

        int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

        while (!q.isEmpty()) {
            Point curr = q.poll();

            for (int i = 0; i < 4; i++) {
                int newR = curr.x + dir[i][0];
                int newC = curr.y + dir[i][1];

                if (newR >= 0 && newC >= 0 && newR < mat.length && newC < mat[0].length) {
                    if (dist[newR][newC] > dist[curr.x][curr.y] + 1) {
                        dist[newR][newC] = dist[curr.x][curr.y] + 1;
                        q.add(new Point(newR, newC));
                    }
                }
            }
        }
        return dist;
    }
}
