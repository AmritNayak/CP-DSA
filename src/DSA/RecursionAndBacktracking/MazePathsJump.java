package DSA.RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class MazePathsJump {
    public static void main(String[] args) {
        int row = 3, column = 3;
//        List<String> res = getMazePaths(1, 1, row, column);
//        System.out.println(res);
        printMazePaths(1, 1, row, column, "");
    }

    static void printMazePaths(int sr, int sc, int dr, int dc, String path) {
        if (sr == dr && sc == dc) {
            System.out.println(path);
            return;
        }

        for (int i = 1; i < dc - sc + 1; i++) {
            printMazePaths(sr, sc + i, dr, dc, path + "H" + i);
        }

        for (int i = 1; i < dr - sr + 1; i++) {
            printMazePaths(sr + i, sc, dr, dc, path + "V" + i);
        }

        for (int i = 1; i < dr - sr + 1 && i < dc - sc + 1; i++) {
            printMazePaths(sr + i, sc + i, dr, dc, path + "D" + i);
        }
    }

    static List<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            List<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        List<String> paths = new ArrayList<>();

        // horizontal moves
        for (int i = 1; i < dc - sc + 1; i++) {
            List<String> hPaths = getMazePaths(sr, sc + i, dr, dc);
            for (String path : hPaths) {
                paths.add("H" + i + path);
            }
        }

        // vertical moves
        for (int i = 1; i < dr - sr + 1; i++) {
            List<String> vPaths = getMazePaths(sr + i, sc, dr, dc);
            for (String path : vPaths) {
                paths.add("V" + i + path);
            }
        }

        // diagonal moves
        for (int i = 1; i < dc - sc + 1 && i < dr - sr + 1; i++) {
            List<String> dPaths = getMazePaths(sr + i, sc + i, dr, dc);
            for (String path : dPaths) {
                paths.add("D" + i + path);
            }
        }

        return paths;
    }
}
