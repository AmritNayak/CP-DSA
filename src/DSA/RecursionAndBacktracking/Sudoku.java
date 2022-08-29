package DSA.RecursionAndBacktracking;

public class Sudoku {
    public static void main(String[] args) {
        int[][] board = {
                {3,0,6,   5,0,8,   4,0,0},
                {5,2,0,   0,0,0,   0,0,0},
                {0,8,7,   0,0,0,   0,3,1},

                {0,0,3,   0,1,0,   0,8,0},
                {9,0,0,   8,6,3,   0,0,5},
                {0,5,0,   0,9,0,   6,0,0},

                {1,3,0,   0,0,0,   2,5,0},
                {0,0,0,   0,0,0,   0,7,4},
                {0,0,5,   2,0,6,   3,0,0},
        };

        sudoku(board, 0, 0);
    }

    static void sudoku(int[][] board, int i, int j) {
        if (i == board.length) {
            displayBoard(board);
            return;
        }

        // next i, next j for iterating sudoku
        int ni = i, nj = j;
        // for moving to next rows and columns
        if (j == board.length - 1) {
            ni++;
            nj = 0;
        } else {
            ni = i;
            nj++;
        }

        // move to next cell
        if (board[i][j] != 0)
            sudoku(board, ni, nj);
        else {
            // po = possible options
            for (int po = 1; po <= 9; po++) {
                if (isValid(board, i, j, po)) {
                    board[i][j] = po;
                    sudoku(board, ni, nj);
                    board[i][j] = 0;
                }
            }
        }
    }

    static boolean isValid(int[][] board, int i, int j, int val) {
        for (int col = 0; col < board[0].length; col++) {
            if (board[i][col] == val)
                return false;
        }

        for (int row = 0; row < board.length; row++) {
            if (board[row][j] == val)
                return false;
        }

        // checking sub matrix
        // first divide then multiply
        int smi = i / 3 * 3;
        int smj = j / 3 * 3;

        for (int ti = 0; ti < 3; ti++) {
            for (int tj = 0; tj < 3; tj++) {
                if (board[smi + ti][smj + tj] == val)
                    return false;
            }
        }

        return true;
    }

    static void displayBoard(int[][] board) {
        for (int[] row: board) {
            for (int cell: row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

}
