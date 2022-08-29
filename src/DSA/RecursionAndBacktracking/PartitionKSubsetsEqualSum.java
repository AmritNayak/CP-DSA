package DSA.RecursionAndBacktracking;

import java.util.ArrayList;

public class PartitionKSubsetsEqualSum {
    public static void main(String[] args) {

        int n = 5, k = 3;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }
        int[] subsetSum = new int[k];
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            res.add(new ArrayList<>());
        }
        kPartitionEqualSum(0, n, k, 0, arr, subsetSum, res);
    }

    static void kPartitionEqualSum(int idx, int n, int k, int sets, int[] arr, int[] subsetSum, ArrayList<ArrayList<Integer>> res) {

        if (idx == n) {
            if (sets == k) {
                boolean flag = true;
                for (int i = 0; i < k - 1; i++) {
                    if (subsetSum[i] != subsetSum[i+1]) {
                        flag = false;
                        break;
                    }
                }
                if (flag)
                    System.out.println(res.toString());
            }
            return;
        }

        for (int i = 0; i < k; i++) {
            if (res.get(i).size() > 0) {
                res.get(i).add(arr[idx]);
                subsetSum[i] += arr[idx];
                kPartitionEqualSum(idx + 1, n, k, sets, arr, subsetSum, res);
                subsetSum[i] -= arr[idx];
                res.get(i).remove(res.get(i).size() - 1);
            } else {
                res.get(i).add(arr[idx]);
                subsetSum[i] += arr[idx];
                kPartitionEqualSum(idx + 1, n, k, sets + 1, arr, subsetSum, res);
                subsetSum[i] -= arr[idx];
                res.get(i).remove(res.get(i).size() - 1);
                break;
            }
        }

    }

}
