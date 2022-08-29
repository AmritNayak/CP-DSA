package DSA.Dynamic_Programming;

import java.util.Arrays;

public class Knapsack01 {

    static int[][] m;

    public static void main(String[] args) {
        int[] value = {42,12,40,25};
        int[] weight = {7,3,4,5};
        int capacity = 10;
        int items = weight.length;

//        int recMaxProfit = recursive(weight, value, capacity, items);
//        System.out.println(recMaxProfit);
//
//        m = new int[items+1][capacity+1];
//        initTable(m, -1);
//        int memMaxProfit = memoize(weight, value, capacity, items);
//        System.out.println(memMaxProfit);

        int[][] dp = topdown(weight, value, capacity, items);
        System.out.println(dp[items][capacity]);
        knapsackItems(dp, weight, value, capacity, items);
    }

    static void knapsackItems(int[][] dp, int[] weight, int[] value, int W, int n) {
        int res = dp[n][W];
        for (int i=n; i > 0 && res > 0; i--) {
            if (res != dp[i-1][W]) {
                System.out.printf("weight: %d value: %d\n", weight[i-1], value[i-1]);
                res -= value[i-1];
                W -= weight[i-1];
            }
        }

    }

    static int[][] topdown(int[] weight, int[] value, int W, int n) {
        int[][] dp = new int[n+1][W+1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < W + 1; j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 0;
                else if (weight[i-1] <= j) {
                    dp[i][j] = Math.max(
                            value[i-1] + dp[i-1][j - weight[i-1]],
                            dp[i-1][j]
                    );
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        for (int[] row : dp) {
            System.out.println(Arrays.toString(row));
        }
        return dp;
    }

    static int memoize(int[] weight, int[] value, int W, int n) {
        if (n == 0 || W == 0) {
//            Profit = 0 when Number of items = 0 OR No more capacity (Knapsack full)
            return  0;
        }
        if (m[n][W] != -1)
            return m[n][W];

        if (weight[n-1] <= W) {
            m[n][W] = Math.max(
                    value[n-1] + recursive(weight, value, W - weight[n-1], n-1),
                    recursive(weight, value, W, n-1)
            );
        } else
            m[n][W] =  recursive(weight, value, W, n-1);

        return m[n][W];
    }

    static int recursive(int[] weight, int[] value, int W, int n) {
        if (n == 0 || W == 0) {
//            Profit = 0 when Number of items = 0 OR No more capacity (Knapsack full)
            return  0;
        }
        if (weight[n-1] <= W) {
            return Math.max(
                    value[n-1] + recursive(weight, value, W - weight[n-1], n-1),
                    recursive(weight, value, W, n-1)
            );
        } else
            return recursive(weight, value, W, n-1);
    }

    static void initTable(int[][] table, int value) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                table[i][j] = value;
            }
        }
    }
}
