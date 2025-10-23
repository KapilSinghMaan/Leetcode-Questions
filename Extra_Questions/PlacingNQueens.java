// The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.

public class PlacingNQueens {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        NQueen(board, 0, 0, 0, board.length, "");
    }

    public static void NQueen(boolean[][] board, int row, int col, int qpsf, int tq, String ans) {
        if (qpsf == tq) {
            System.out.println(ans);
            return;
        }

        if (col == board[0].length) {
            row++;
            col = 0;
        }

        if (row == board.length) {
            return;
        }

        if (isItSafeToPlaceTheQueen(board, row, col)) {
            board[row][col] = true;

            NQueen(board, row + 1, 0, qpsf + 1, tq, ans + "{" + row + "-" + col + "}");

            board[row][col] = false;
        }
        NQueen(board, row, col + 1, qpsf, tq, ans);
    }

    public static boolean isItSafeToPlaceTheQueen(boolean[][] board, int row, int col) {
        int r = row - 1;
        int c = col;

        while (r >= 0) {
            if (board[r][c]) {
                return false;
            }
            r--;
        }

        r = row - 1;
        c = col - 1;
        while (r >= 0 && c >= 0) {
            if (board[r][c]) {
                return false;
            }
            r--;
            c--;
        }

        r = row - 1;
        c = col + 1;

        while (r >= 0 && c < board[0].length) {
            if (board[r][c]) {
                return false;
            }
            r--;
            c++;
        }

        return true;
    }
}
