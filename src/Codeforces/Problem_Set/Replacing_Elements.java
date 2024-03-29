package Codeforces.Problem_Set;

import java.util.Arrays;
import java.util.Scanner;

public class Replacing_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int d = sc.nextInt();
            int[] arr = new int[n];
            for (int i=0; i<n; i++)
                arr[i] = sc.nextInt();
            Arrays.sort(arr);
            System.out.println((arr[0] + arr[1]) <= d || arr[n-1] <= d ? "YES" : "NO");
        }
    }
}
