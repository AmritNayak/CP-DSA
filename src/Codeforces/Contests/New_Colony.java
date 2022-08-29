package Codeforces.Contests;

import java.util.Scanner;

public class New_Colony {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            int[] arr = new int[n];
            for (int i=0; i<n; i++)
                arr[i] = sc.nextInt();
            int pos = -1;
            for (long b=1; b<=k; b++) {
                int h=0;
                for (h=0; h<n-1; h++) {
                    if (arr[h] >= arr[h+1]) {
                        continue;
                    }
                    else {
                        arr[h]++;
                        break;
                    }
                }
                if (h == n-1) {
                    pos = -1;
                    break;
                }
                else {
                    pos = h+1;
                }
            }
            System.out.println(pos);
        }
    }
}
