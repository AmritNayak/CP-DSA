package DSA.Arrays;

import java.util.HashSet;

public class UnionIntersection {
    public static void main(String[] args) {
        int[] a = { 1, 2, 5, 6, 2, 3, 5 };
        int[] b = { 2, 4, 5, 6, 8, 9, 4, 6, 5 };
        union(a, b);
        intersection(a, b);
    }

    static void union(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int e : arr1)
            set.add(e);
        for (int e : arr2)
            set.add(e);
        System.out.println(set.toString());
    }

    static void intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();
        for (int e : arr1)
            set.add(e);
        for (int e : arr2) {
            if (set.contains(e))
                res.add(e);
        }
        System.out.println(res.toString());
    }
}
