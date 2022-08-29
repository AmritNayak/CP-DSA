package DSA.Dynamic_Programming;

public class BinomialCoeff {
    public static void main(String[] args) {
        int n = 11, k = 7;
        System.out.println(binomialCoeff(n, k));
    }

    static int binomialCoeff(int n, int k) {
        int[][] dp = new int[n+1][k+1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, k); j++) {
                if (j == 0 || i == j)
                    dp[i][j] = 1;
                else
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-1];
            }
        }

        return dp[n][k];
    }
}
