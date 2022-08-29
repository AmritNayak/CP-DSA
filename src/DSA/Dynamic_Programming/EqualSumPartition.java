package DSA.Dynamic_Programming;

public class EqualSumPartition {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 9, 12 };
        int n = arr.length;
        System.out.println(esp(arr, n));
    }

    static boolean esp(int[] arr, int n) {
        int sum = 0;
        for (int e : arr)
            sum += e;
        if ((sum & 1) == 1)
            return false;

        sum /= 2;
//        use subset sum
        boolean[][] dp = new boolean[n+1][sum+1];
        for (int i = 0; i < sum + 1; i++)
            dp[0][i] = false;
        for (int i = 0; i < n + 1; i++)
            dp[i][0] = true;

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (arr[i-1] <= j)
                    dp[i][j] = dp[i-1][j - arr[i-1]] || dp[i-1][j];
                else
                    dp[i][j] = dp[i-1][j];
            }
        }

        return dp[n][sum];
    }
}
