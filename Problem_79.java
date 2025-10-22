// https://leetcode.com/problems/word-search/description/

// 79. Word Search

public class Problem_79 {
    private char[][] board;
    public boolean exist(char[][] board, String word) {
        this.board=board;
        for(int row=0;row<board.length;row++)
        {
            for(int col=0;col<board[0].length;col++)
            {
                if (backtrack(row,col,word,0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean backtrack(int row,int col,String word,int idx)
    {
        if (idx>=word.length()) {
            return true;
        }
        if (row <0 || row==board.length|| col<0||col==board[0].length||board[row][col]!=word.charAt(idx)) {
            return false;
        }

        this.board[row][col]='#';

        int[] rowOffSet={0,1,0,-1};
        int[] colOffset={1,0,-1,0};

        for(int d=0;d<4;d++)
        {
            if (backtrack(row+rowOffSet[d], col+colOffset[d], word, idx+1)) {
                return true;
            }
        }

        this.board[row][col]=word.charAt(idx);
        return false;
    }
}
