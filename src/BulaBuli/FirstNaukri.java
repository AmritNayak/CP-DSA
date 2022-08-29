package BulaBuli;

import java.util.Scanner;

public class FirstNaukri {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//        while (t-- != 0) {
//            int n = in.nextInt();
//            int[] arr = new int[n];
//            for (int i=0; i<n; i++)
//                arr[i] = in.nextInt();
//            System.out.println(solve(arr, n));
//        }
//        System.out.println(D_to_B(7));
        int n = 5;
        System.out.println(charity(2));
    }



    public static int charity(int input1) {
        return input1 * (input1 + 1) * (2 * input1 + 1) / 6;
    }

    static long solve(int[] arr, int n) {
        long sum = 0;
        for (int i = 0; i < 32; i++) {
            int c = 0;
            for (int j = 0; j < n; j++) {
                if ((arr[j] & (1 << i)) != 0)
                    c++;
            }
            int subset = (1 << c) - 1;
            subset = (subset * (1 << i)) % 1000000007;
            sum = (sum + subset) % 1000000007;
        }
        return sum;
    }

    public static String D_to_B(long n) {
        if (n == 0)
            return "0";
        String res = "";
        while (n > 0) {
            res = (char) (n % 2 + 48) + res;
            n /= 2;
        }
        return res;
    }
}
