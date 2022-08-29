package DSA.Dynamic_Programming;

public class CountSubsetSum {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,8,10};
        int n = arr.length, sum = 10;
        System.out.println(count(arr, n, sum));
    }

    static int count(int[] arr, int n, int sum) {
        int[][] dp = new int[n+1][sum+1];
        for (int i = 0; i < sum+1; i++)
            dp[0][i] = 0;
        for (int i = 0; i < n+1; i++)
            dp[i][0] = 1;

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < sum+1; j++) {
                if (arr[i-1] <= j) {
                    dp[i][j] = dp[i-1][j - arr[i-1]] + dp[i-1][j];
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][sum];
    }
}
