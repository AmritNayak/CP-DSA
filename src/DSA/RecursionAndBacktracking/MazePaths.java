package DSA.RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class MazePaths {
    public static void main(String[] args) {
        int row = 3, column = 3;
//        List<String> paths = getMazePaths(1, 1, row, column);
//        System.out.println(paths);
//        System.out.println(paths.size());
        printMazePaths(1, 1, row, column, "");
    }

    static void printMazePaths(int sr, int sc, int dr, int dc, String path) {
        if (sr > dr || sc > dc)
            return;
        if (sr == dr && sc == dc) {
            System.out.println(path);
            return;
        }

        printMazePaths(sr + 1, sc, dr, dc, path + "V");
        printMazePaths(sr, sc + 1, dr, dc, path + "H");
    }

    // one step at a time, either horizontally right or vertically down
    static List<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            List<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        List<String> hPath = new ArrayList<>();
        List<String> vPath = new ArrayList<>();

        // for vertical movement
        if (sr < dr) {
            vPath = getMazePaths(sr + 1, sc, dr, dc);
        }
        // for horizontal movement
        if (sc < dc) {
            hPath = getMazePaths(sr, sc + 1, dr, dc);
        }

        List<String> paths = new ArrayList<>();
        for (String path: hPath) {
            paths.add('H' + path);
        }
        for (String path: vPath) {
            paths.add('V' + path);
        }
        return paths;
    }
}
