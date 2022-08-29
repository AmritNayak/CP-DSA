package DSA.Dynamic_Programming;

public class Tiling_2xN {

    static int dpWays(int n) {
        if (n == 1 || n == 2) return n;
        int[] dp = new int[n];
        dp[0] = 1;      // board is 2x1
        dp[1] = 2;      // board is 2x2
        for (int i=2; i<n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
            // dp[i-1] if top ith square is occupied with tile vertically
            // dp[i-2] if top ith square is occupied with tile horizontally and the bottom square is bound to be occupied with tile horizontally
        }
        return dp[n-1];
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(dpWays(n));
    }
}
