package DSA.Dynamic_Programming;

public class TargetSum {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3};
        int sum = 1;
        System.out.println(count(arr, arr.length, sum));
    }

    static int count(int[] arr, int n, int sum) {
        int s = 0;
        for (int e : arr)
            sum += e;

        if ((sum - s) % 2 == 1)
            return 0;

        int s1 = (sum - s) / 2;
//        use count subset sum
        int[][] dp = new int[n+1][s1+1];
        for (int i = 0; i < s1+1; i++)
            dp[0][i] = 0;
        for (int i = 0; i < n+1; i++)
            dp[i][0] = 1;

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < s1+1; j++) {
                if (arr[i-1] <= j)
                    dp[i][j] = dp[i-1][j - arr[i-1]] + dp[i-1][j];
                else
                    dp[i][j] = dp[i-1][j];
            }
        }

        return dp[n][s1];
    }
}
