package DSA.RecursionAndBacktracking;

import java.util.ArrayList;

public class PartitionKSubsets {
    public static void main(String[] args) {
        int n = 3, k = 2;
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            res.add(new ArrayList<>());
        }
        partitionKSubsets(1, n, k, 0, res);
    }

    static void partitionKSubsets(int i, int n, int k, int setsSoFar, ArrayList<ArrayList<Integer>> res) {
        if (i > n) {
            if (setsSoFar == k)
                System.out.println(res.toString());
            return;
        }

        for (int j = 0; j < res.size(); j++) {
            if (!res.get(j).isEmpty()) {
                res.get(j).add(i);
                partitionKSubsets(i + 1, n, k, setsSoFar, res);
                res.get(j).remove(res.get(j).size() - 1);
            } else {
                res.get(j).add(i);
                partitionKSubsets(i + 1, n, k, setsSoFar + 1, res);
                res.get(j).remove(res.get(j).size() - 1);
                break;
            }
        }
    }
}
