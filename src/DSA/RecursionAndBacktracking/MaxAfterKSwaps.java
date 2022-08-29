package DSA.RecursionAndBacktracking;

import java.util.Arrays;

public class MaxAfterKSwaps {

    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        char[] num = "123456789".toCharArray();
        int k = 3;
        maxAfterKSwaps(num, k);
        System.out.println(max);
    }

    static void maxAfterKSwaps(char[] num, int k) {
        if (k == 0) {
            if (max < Integer.parseInt(String.valueOf(num))) {
                max = Integer.parseInt(String.valueOf(num));
            }
            return;
        }

        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[j] > num[i]) {
                    swap(num, i, j);
                    maxAfterKSwaps(num, k - 1);
                    swap(num, i, j);
                }
            }
        }
    }

    static void swap(char[] num, int i, int j) {
        char temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
}
