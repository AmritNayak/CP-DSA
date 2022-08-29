package CodeChef.Contests;

import java.util.Arrays;
import java.util.Scanner;

public class TSOH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        for (int i=0; i<n; i++) {
            int x = sc.nextInt();
            if (x==0)
                coins[i] = -100001;
            else
                coins[i] = x;
        }
        Arrays.sort(coins);
        int sum = coins[n-1] + coins[n-2];
        for (int j=n-3; j>=0; j--) {
            if (coins[j]>0) {
                sum += coins[j];
            }
        }
        System.out.println(sum);
    }
}
