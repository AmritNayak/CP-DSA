package DSA.RecursionAndBacktracking;

import java.util.ArrayList;

public class MinSubsetSumDiff {

    static int min = Integer.MAX_VALUE;
    static String res = "";

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        minSubsetSumDiff(arr, 0, new ArrayList<>(), new ArrayList<>(), 0, 0);
        System.out.println(min);
        System.out.println(res);
    }

    static void minSubsetSumDiff(
            int[] arr, int idx,
            ArrayList<Integer> s1,
            ArrayList<Integer> s2,
            int sum1, int sum2) {

        if (idx == arr.length) {
            int diff = Math.abs(sum1 - sum2);
            if (diff < min) {
                min = diff;
                res = s1.toString() + " " + s2.toString();
            }
            return;
        }

        // arr.length + 1 to handle even or odd number of elements
        if (s1.size() < (arr.length + 1) / 2) {
            s1.add(arr[idx]);
            minSubsetSumDiff(arr, idx + 1, s1, s2, sum1 + arr[idx], sum2);
            s1.remove(s1.size() - 1);
        }

        if (s2.size() < (arr.length + 1) / 2) {
            s2.add(arr[idx]);
            minSubsetSumDiff(arr, idx + 1, s1, s2, sum1, sum2 + arr[idx]);
            s2.remove(s2.size() - 1);
        }

    }
}
