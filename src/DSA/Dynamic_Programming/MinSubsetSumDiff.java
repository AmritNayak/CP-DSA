package DSA.Dynamic_Programming;

public class MinSubsetSumDiff {
    public static void main(String[] args) {
        int[] arr = {1,2,7};
        int n = arr.length;
        int res = minSubsetSumDiff(arr, n);
        System.out.println(res);
    }

    static int minSubsetSumDiff(int[] arr, int n) {
        int range = 0;
        for (int e : arr)
            range += e;

        int min = Integer.MAX_VALUE;
        boolean[][] dp = subsetSum(arr, n, range);
        for (int i = dp[n].length / 2; i >= 0; i--) {
            if (dp[n][i]) {
                min = range - 2 * i;
                break;
            }
        }
        return Math.abs(min);
    }

    static boolean[][] subsetSum(int[] arr, int n, int sum) {
        boolean[][] dp = new boolean[n+1][sum+1];
        for (int i = 0; i < sum+1; i++) {
            dp[0][i] = false;
        }
        for (int i = 0; i < n+1; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < sum+1; j++) {
                if (arr[i-1] <= j) {
                    dp[i][j] = dp[i-1][j - arr[i-1]] || dp[i-1][j];
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp;
    }
}
