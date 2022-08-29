package DSA.Dynamic_Programming;

public class RodCutting {
    public static void main(String[] args) {
        int n = 8;
        int[] length = {1,2,3,4,5,6,7,8};
        int[] price = {1,5,8,9,10,17,17,20};
        System.out.println(rodCut(length, price, n));
    }

    static int rodCut(int[] length,int[] price, int n) {
        int[][] dp = new int[n+1][n+1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 0;
                else if (length[i-1] <= j) {
                    dp[i][j] = Math.max(
//                            dp[i][...] because we can take the same item again
                            price[i-1] + dp[i][j - length[i-1]],
                            dp[i-1][j]
                    );
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][n];
    }
}
