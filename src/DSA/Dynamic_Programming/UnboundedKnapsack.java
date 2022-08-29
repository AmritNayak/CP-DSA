package DSA.Dynamic_Programming;

public class UnboundedKnapsack {
    public static void main(String[] args) {
        int W = 100;
        int[] value = {10, 30, 20};
        int[] weight = {5, 10, 15};
        int n = value.length;
        System.out.println(unboundedKnapsack(weight, value, n, W));
    }

    static int unboundedKnapsack(int[] weight,int[] value, int n, int W) {
        int[][] dp = new int[n+1][W+1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < W + 1; j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 0;
                else if (weight[i-1] <= j) {
                    dp[i][j] = Math.max(
//                            dp[i][...] because we can take the same item again
                            value[i-1] + dp[i][j - weight[i-1]],
                            dp[i-1][j]
                    );
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][W];
    }
}
