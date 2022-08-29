package DSA.RecursionAndBacktracking;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {2,3,5,6,7};
        int target = 12;
//        coinChange(coins, 0, 0, target, "");
        coinChangeR(coins, 0, 0, target, "");
    }


    static void coinChange(int[] coins, int i, int currSum, int target, String res) {
        if (i == coins.length) {
            if (currSum == target)
                System.out.println(res);
            return;
        }

        coinChange(coins, i + 1, currSum, target, res);
        coinChange(coins, i + 1, currSum + coins[i], target, res + coins[i] + " ");
    }

    static void coinChangeR(int[] coins, int i, int currSum, int target, String res) {
        if (i == coins.length) {
            if (currSum == target)
                System.out.println(res);
            return;
        }

        for (int j = target / coins[i]; j >= 1; j--) {
            String temp = "";
             for (int k = 0; k < j; k++) {
                 temp += coins[i] + " ";
             }
            coinChangeR(coins, i + 1, currSum + coins[i] * j, target, res + temp);
        }
        coinChangeR(coins, i + 1, currSum, target, res);
    }
}
