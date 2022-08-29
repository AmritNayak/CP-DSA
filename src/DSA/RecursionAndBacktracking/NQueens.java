package DSA.RecursionAndBacktracking;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        int[][] board = new int[n][n];
        nQueens(board, "", 0);
    }

    static void nQueens(int[][] board, String ansSoFar, int row) {
        if (row == board.length) {
            System.out.println(ansSoFar);
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1;
                nQueens(board, ansSoFar + row +  "-" + col + " ", row + 1);
                board[row][col] = 0;
            }
        }
    }

    static boolean isSafe(int[][] board, int row, int col) {
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 1)
                return false;
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1)
                return false;
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 1)
                return false;
        }

        return true;
    }
}
