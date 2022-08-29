package Codeforces.Problem_Set;

import java.util.Scanner;

public class Team {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 0;
        while (t-- > 0) {
            int sum = sc.nextInt() + sc.nextInt() + sc.nextInt();
            if (sum >= 2)
                count++;
        }
        System.out.println(count);
    }
}