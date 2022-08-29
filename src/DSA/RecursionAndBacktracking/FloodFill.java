package DSA.RecursionAndBacktracking;

public class FloodFill {
    public static void main(String[] args) {
//        int row = 5, column = 5;
//        int[][] arr = new int[row][column];

        int[][] maze = {
                {0,1,0,0,0,0,0},
                {0,1,0,1,1,1,0},
                {0,0,0,0,0,0,0},
                {1,0,1,1,0,1,1},
                {1,0,1,1,0,1,1},
                {1,0,0,0,0,0,0}
        };
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        floodFill(maze, 0, 0, "", visited);
    }

    static void floodFill(int[][] maze, int row, int column, String path, boolean[][] visited) {
        if (row < 0 || row == maze.length || column < 0 || column == maze[0].length || maze[row][column] == 1 || visited[row][column])
            return;

        if (row == maze.length - 1 && column == maze[0].length - 1) {
            System.out.println(path);
            return;
        }

        visited[row][column] = true;
        // top
        floodFill(maze, row - 1, column, path + "T", visited);
        // left
        floodFill(maze, row, column - 1, path + "L", visited);
        // down
        floodFill(maze, row + 1, column, path + "D", visited);
        // right
        floodFill(maze, row, column + 1, path + "R", visited);

        // backtrack
        visited[row][column] = false;

    }
}
