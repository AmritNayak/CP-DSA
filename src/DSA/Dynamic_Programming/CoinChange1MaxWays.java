package DSA.Dynamic_Programming;

public class CoinChange1MaxWays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int n = arr.length;
        int sum = 4;
        System.out.println(coinChange1(arr, n, sum));
    }

    static int coinChange1(int[] coins, int n, int sum) {
        int[][] dp = new int[n+1][sum+1];
        for (int i=0; i<sum+1; i++)
            dp[0][i] = 0;
        for (int i=0; i<n+1; i++)
            dp[i][0] = 1;
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < sum+1; j++) {
                if (coins[i-1] <= j)
                    dp[i][j] = dp[i][j - coins[i-1]] + dp[i-1][j];
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][sum];
    }
}
