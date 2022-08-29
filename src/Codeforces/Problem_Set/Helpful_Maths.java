package Codeforces.Problem_Set;

import java.util.Arrays;
import java.util.Scanner;

public class Helpful_Maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int[] arr = new int[(n+1)/2];
        for (int i=0,j=0; i<n; i+=2,j++) {
            arr[j] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        Arrays.sort(arr);
        System.out.print(arr[0]);
        for (int i=1; i<(n+1)/2; i++) {
            System.out.print("+" + arr[i]);
        }
    }
}
