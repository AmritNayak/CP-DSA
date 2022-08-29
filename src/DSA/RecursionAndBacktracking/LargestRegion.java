package DSA.RecursionAndBacktracking;

public class LargestRegion {
    public static void main(String[] args) {
        int[][] island = {
                {0,1,0,0,1},
                {1,0,1,0,0},
                {1,1,1,1,0},
                {0,0,0,1,1}
        };
        int rows = island.length, cols = island[0].length;
        int largestRegion = findLargestRegion(island, rows, cols);
        System.out.println(largestRegion);
    }

    static int findLargestRegion(int[][] island, int rows, int cols) {
        boolean[][] visited = new boolean[rows][cols];
        int res = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (island[i][j] == 1 && !visited[i][j]) {
                    res = Math.max(res, travel(island, i, j, visited));
                }
            }
        }
        return res;
    }

    static int travel(int[][] island, int i, int j, boolean[][] visited) {
        if (i < 0 || i >= island.length ||
            j < 0 || j >= island[0].length ||
            island[i][j] == 0 || visited[i][j]) {
            return 0;
        }

        visited[i][j] = true;
        int up = travel(island, i-1, j, visited);
        int down = travel(island, i+1, j, visited);
        int left = travel(island, i, j-1, visited);
        int right = travel(island, i, j+1, visited);

        // do not backtrack as we don't want to consider same cell multiple times
        return 1 + up + down + left + right;
    }
}
