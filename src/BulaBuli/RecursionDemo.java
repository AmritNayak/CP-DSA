package BulaBuli;

import java.util.Arrays;
import java.util.Scanner;

public class RecursionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
        int[] arr = {2,9,6,1,3,4};
//        System.out.println(max(arr, 0));
//        System.out.println(fibo(5));
        System.out.println(pow(3, 6));
    }

    static int pow(int x, int n) {
        if (n == 0)
            return 1;
        return pow(x, n-1) * x;
    }

    static int fibo(int n) {
        if (n == 0 || n == 1)
            return n;
        return fibo(n-1) + fibo(n-2);
    }

    static int fact(int n) {
        if (n == 0)
            return 1;
        return fact(n-1) * n;
    }

    static int max(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        int first = arr[idx];
        int rest = max(arr, idx+1);
//        print(arr, idx);
//        System.out.println(" -> " + Math.max(first, rest));
        return Math.max(first, rest);
    }

    static void print(int[] arr, int idx) {
        int n = arr.length;
        for (int i=idx; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
