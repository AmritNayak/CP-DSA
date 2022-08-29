package DSA.Dynamic_Programming;

public class CountSubsetSumDiff {

    public static void main(String[] args) {
        int[] arr = {1,1,2,3};
        int diff = 1;
        System.out.println(count(arr, arr.length, diff));
    }

    static int count(int[] arr, int n, int diff) {
        int sum = 0;
        for (int e : arr)
            sum += e;

        if ((sum - diff) % 2 == 1)
            return 0;

        int s1 = (sum - diff) / 2;
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
