package CodeChef.Contests;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Maximise_Function {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i=0; i<n; i++)
                arr[i] = sc.nextLong();
            long sum = Long.MIN_VALUE;
            Arrays.sort(arr);
            long max = Math.abs(arr[n-1] - arr[0]);
            long tempSum = 0;
            for (int y=1; y<n-1; y++) {
                tempSum = Math.abs((arr[y] - arr[0])) + Math.abs((arr[n-1] - arr[y]));
                sum = Math.max(max, tempSum);
            }
            System.out.println(max+sum);
        }
    }
}
