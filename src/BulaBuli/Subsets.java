package BulaBuli;

import java.util.ArrayList;

public class Subsets {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int n = 3, idx = 0;
        ArrayList<Integer> res = new ArrayList<>();
        printSubsets(arr, n, idx, res);
    }

    static void printSubsets(int[] arr, int n, int idx, ArrayList<Integer> res) {
        if (idx == n) {
            System.out.println(res.toString());
            return;
        }

        int curr = arr[idx];
        res.add(curr);
        printSubsets(arr, n, idx+1, res);

        res.remove(res.size() - 1);
        printSubsets(arr, n, idx+1, res);
    }
}
