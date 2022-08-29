package DSA.Dynamic_Programming;

public class CoinChange2MinCoins {
    public static void main(String[] args) {
        int[] coins = {3,4,5};
        int n = coins.length;
        int sum = 8;
        System.out.println(coinChange2(coins, n, sum));
    }

    static int coinChange2(int[] coins, int n, int sum) {
        int[][] dp = new int[n+1][sum+1];
        for (int i = 0; i < sum+1; i++)
            dp[0][i] = Integer.MAX_VALUE - 1;
        for (int i = 0; i < n+1; i++)
            dp[i][0] = 0;
//        for (int i = 1; i < sum+1; i++) {
//            if (i % coins[0] == 0)
//                dp[1][i] = i / coins[0];
//            else
//                dp[1][i] = Integer.MAX_VALUE - 1;
//        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < sum+1; j++) {
                if (coins[i-1] <= j)
                    dp[i][j] = Math.min(
//                            include coin -> + 1
                            dp[i][j - coins[i-1]] + 1,
                            dp[i-1][j]
                    );
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][sum];
    }
}
