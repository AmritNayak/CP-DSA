package Codeforces.Problem_Set;

import java.io.IOException;
import java.util.Scanner;

public class Missing_Number {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int count = 0;
            int[] freq = new int[n];
            for (int i=0; i<n; i++) {
                int index = sc.nextInt();
                freq[index-1]++;
            }
            for (int i=0; i<n; i++) {
                count = Math.max(count, freq[i]);
            }
            System.out.println(count);
        }
    }
}
