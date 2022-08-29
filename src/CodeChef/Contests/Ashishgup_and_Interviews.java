package CodeChef.Contests;

import java.util.Scanner;

public class Ashishgup_and_Interviews {

    static boolean isRejected(int[] arr, int n) {
        int solved = 0;
        for (int i=0; i<n; i++) {
            if (arr[i] != -1)
                solved++;
        }
        return solved < Math.ceil(n/2.0);
    }

    static boolean isTooSlow(int[] arr, int n, int k) {
        for (int i=0; i<n; i++) {
            if (arr[i] > k)
                return true;
        }
        return false;
    }

    static boolean isBot(int[] arr, int n) {
        for (int i=0; i<n; i++) {
            if (arr[i] != 1 && arr[i] != 0)
                return false;
        }
        return true;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes her
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i=0; i<n; i++)
                arr[i] = sc.nextInt();
            if (isRejected(arr,n))
                System.out.println("Rejected");
            else if (isTooSlow(arr,n,k))
                System.out.println("Too Slow");
            else if (isBot(arr,n))
                System.out.println("Bot");
            else
                System.out.println("Accepted");
        }
    }
}
