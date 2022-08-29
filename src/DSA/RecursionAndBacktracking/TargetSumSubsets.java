package DSA.RecursionAndBacktracking;

public class TargetSumSubsets {
    public static void main(String[] args) {
        int target = 60;
        int[] arr = {10,20,30,40,50};
        targetSumSubsets(arr, 0, target, 0, "");
    }

    static void targetSumSubsets(int[] arr, int idx, int target, int sumSoFar, String set) {
        if (idx == arr.length) {
            if (target == sumSoFar) {
                System.out.println(set);
            }
            return;
        }

        targetSumSubsets(arr, idx + 1, target, sumSoFar + arr[idx], set + arr[idx] + " ");
        targetSumSubsets(arr, idx + 1, target, sumSoFar, set);
    }
}
