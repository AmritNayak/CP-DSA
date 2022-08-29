package DSA.Dynamic_Programming;

import java.util.Arrays;

public class MaxSumNonConsecutive {

    static int dpSum(int[] arr, int n) {
        if (n == 1) return arr[0];
        int[] dp = new int[n];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        for (int i=2; i<n; i++) {
            dp[i] = Math.max(dp[i-1], arr[i] + dp[i-2]);
            // dp[i-1] for excluding ith element in arr
            // dp[i-2] + ith element for including ith element
        }
        System.out.println(Arrays.toString(dp));
        return dp[n-1];
    }

    public static void main(String[] args) {
        int[] arr = {99, 50, 100, 51, 1, 99};
        System.out.println(dpSum(arr, arr.length));
    }
}
