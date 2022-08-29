package DSA.RecursionAndBacktracking;

public class KnightsTour {
    public static void main(String[] args) {
        int n = 5, row = 2, col = 2;
        int[][] board = new int[n][n];
        knightsTour(board, row, col, 1);
    }

    static void knightsTour(int[][] board, int row, int col, int move) {
        if (row < 0 || row >= board.length || col < 0 || col >= board.length || board[row][col] != 0)
            return;
        else if (move == board.length * board.length) {
            board[row][col] = move;
            displayBoard(board);
            board[row][col] = 0;
            return;
        }

        board[row][col] = move;

        // possible moves for the knight
        knightsTour(board, row - 2, col + 1, move + 1);
        knightsTour(board, row - 1, col + 2, move + 1);
        knightsTour(board, row + 1, col + 2, move + 1);
        knightsTour(board, row + 2, col + 1, move + 1);
        knightsTour(board, row + 2, col - 1, move + 1);
        knightsTour(board, row + 1, col - 2, move + 1);
        knightsTour(board, row - 1, col - 2, move + 1);
        knightsTour(board, row - 2, col - 1, move + 1);

        // backtrack
        board[row][col] = 0;

    }

    static void displayBoard(int[][] board) {
        for (int[] row: board) {
            for (int cell: row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
