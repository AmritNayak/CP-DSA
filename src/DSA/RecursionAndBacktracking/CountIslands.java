package DSA.RecursionAndBacktracking;

public class CountIslands {
    public static void main(String[] args) {
        int[][] island = {
                {0,1,0,0,1},
                {1,0,1,0,0},
                {1,0,1,1,0},
                {0,0,0,1,1}
        };
        int rows = island.length, cols = island[0].length;
        int islandCount = countIslands(island, rows, cols);
        System.out.println(islandCount);
    }

    static int countIslands(int[][] island, int rows, int cols) {
        boolean[][] visited = new boolean[rows][cols];
        int res = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (island[i][j] == 1 && !visited[i][j]) {
                    res++;
                    travel(island, i, j, visited);
                }
            }
        }
        return res;
    }

    static void travel(int[][] island, int i, int j, boolean[][] visited) {
        if (i < 0 || i >= island.length ||
            j < 0 || j >= island[0].length ||
            island[i][j] == 0 || visited[i][j]
        ) return;

        visited[i][j] = true;
        // UP
        travel(island, i-1, j, visited);
        // DOWN
        travel(island, i+1, j, visited);
        // LEFT
        travel(island, i, j-1, visited);
        // RIGHT
        travel(island, i, j+1, visited);

        // do not backtrack as we don't want to consider same cell multiple times
    }
}
