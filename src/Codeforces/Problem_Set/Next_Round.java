package Codeforces.Problem_Set;

import java.util.Scanner;

public class Next_Round {

    static int solve(int n, int k, int[] arr) {
        int score = arr[k-1];
        int res;
        if (score == 0) {
            res = 0;
            for (int i=0; i<k; i++) {
                if (arr[i] == 0)
                    break;
                else
                    res++;
            }
        }
        else {
            res = k;
            for (int i=k; i<n; i++) {
                if (arr[i] == score)
                    res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solve(n,k,arr));
    }
}
