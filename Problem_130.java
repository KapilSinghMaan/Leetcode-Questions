// 130. Surrounded Regions

// https://leetcode.com/problems/surrounded-regions/description/

public class Problem_130 {

    public static void DFS(char[][] board, int x, int y, char prev, char newVar) {
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length) {
            return;
        }

        if (board[x][y] != prev) {
            return;
        }

        board[x][y] = newVar;

        DFS(board, x + 1, y, prev, newVar);
        DFS(board, x - 1, y, prev, newVar);
        DFS(board, x, y + 1, prev, newVar);
        DFS(board, x, y - 1, prev, newVar);
    }

    public void solve(char[][] board) {

        int row = board.length;
        int col = board[0].length;

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if (board[r][c] == 'O') {
                    board[r][c] = '-';
                }
            }
        }

        for (int i = 0; i < row; i++) {
            if (board[i][0] == '-') {
                DFS(board, i, 0, '-', 'O');
            }
        }

        for (int i = 0; i < row; i++) {
            if (board[i][col - 1] == '-') {
                DFS(board, i, col - 1, '-', 'O');
            }
        }

        for (int i = 0; i < col; i++) {
            if (board[0][i] == '-') {
                DFS(board, 0, i, '-', 'O');
            }
        }

        for (int i = 0; i < col; i++) {
            if (board[row - 1][i] == '-') {
                DFS(board, row - 1, i, '-', 'O');
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == '-') {
                    board[i][j] = 'X';
                }
            }
        }
    }
}
