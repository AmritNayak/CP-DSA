package DSA.RecursionAndBacktracking;

import java.util.ArrayList;

public class GoldMine2 {

    static int max = 0;

    public static void main(String[] args) {
        int[][] goldMine = {
                {10, 0, 100, 200, 0,  8,  0},
                {20, 0, 0,   0,   0,  6,  0},
                {30, 0, 0,   9,   12, 3,  4},
                {40, 0, 2,   5,   9,  3,  11},
                {0,  0, 0,   0,   0,  9,  0},
                {5,  6, 7,   0,   7,  4,  2},
                {8,  9, 10,  0,   1,  10, 8},
        };
        getMaxGold(goldMine);
        System.out.println(max);
    }

    static void getMaxGold(int[][] goldMine) {
        boolean[][] visited = new boolean[goldMine.length][goldMine[0].length];
        for (int i = 0; i < goldMine.length; i++) {
            for (int j = 0; j < goldMine[i].length; j++) {
                ArrayList<Integer> bag = new ArrayList<>();
                travelAndCollectGold(goldMine, i, j, bag, visited);

                int sum = 0;
                for (int gold: bag) {
                    sum += gold;
                }
                if (sum > max)
                    max = sum;
            }
        }
    }

    static void travelAndCollectGold(
            int[][] goldMine,
            int i, int j,
            ArrayList<Integer> bag,
            boolean[][] visited) {

        if (i < 0 || i >= goldMine.length || j < 0 || j >= goldMine[i].length || goldMine[i][j] == 0 || visited[i][j]) {
            return;
        }

        visited[i][j] = true;
        bag.add(goldMine[i][j]);

        // north
        travelAndCollectGold(goldMine, i - 1, j, bag, visited);
        // east
        travelAndCollectGold(goldMine, i, j + 1, bag, visited);
        // west
        travelAndCollectGold(goldMine, i, j - 1, bag, visited);
        // south
        travelAndCollectGold(goldMine, i + 1, j, bag, visited);

    }
}
