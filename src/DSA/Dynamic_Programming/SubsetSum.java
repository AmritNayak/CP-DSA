package DSA.Dynamic_Programming;

public class SubsetSum {
    public static void main(String[] args) {
        int[] arr = { 3, 34, 4, 12, 5, 2 };
        int sum = 10;
        int n = arr.length;
        System.out.println(subsetSum(arr, n, sum));
    }

    static boolean subsetSum(int[] arr, int n, int sum) {
        boolean[][] dp = new boolean[n+1][sum+1];

//        Initialize base
        for (int j = 0; j < n + 1; j++) {
//            no items with sum = j
            dp[0][j] = false;
        }
        for (int i = 0; i < n + 1; i++) {
//            any items with sum = 0
            dp[i][0] = true;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (arr[i-1] <= j) {
                    dp[i][j] = dp[i-1][j - arr[i-1]] || dp[i-1][j];
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][sum];
    }
}
