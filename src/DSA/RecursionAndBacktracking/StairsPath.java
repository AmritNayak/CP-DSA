package DSA.RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class StairsPath {
    static int c = 0;
    public static void main(String[] args) {
        int n = 10;
//        List<String> paths = getStairsPath(n);
//        System.out.println(paths);
//        System.out.println(paths.size());
        printStairsPaths(n, "");
        System.out.println("Count: " + c);
    }

    static void printStairsPaths(int n, String path) {
        if (n < 0)
            return;
        if (n == 0) {
            System.out.println(path);
            c++;
            return;
        }
        printStairsPaths(n-1, path + "1");
        printStairsPaths(n-2, path + "2");
        printStairsPaths(n-3, path + "3");
    }

    static List<String> getStairsPath(int n) {
        if (n == 0) {
            List<String> baseZero = new ArrayList<>();
            baseZero.add("");
            return baseZero;
        } else if (n < 0) {
            return new ArrayList<>();
        }

        List<String> p1 = getStairsPath(n - 1);
        List<String> p2 = getStairsPath(n - 2);
        List<String> p3 = getStairsPath(n - 3);

        List<String> paths = new ArrayList<>();
        for (String path : p1) {
            paths.add("1" + path);
        }
        for (String path : p2) {
            paths.add("2" + path);
        }
        for (String path : p3) {
            paths.add("3" + path);
        }

        return paths;
    }
}
