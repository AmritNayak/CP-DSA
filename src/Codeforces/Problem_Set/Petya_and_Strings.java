package Codeforces.Problem_Set;

import java.util.Scanner;

public class Petya_and_Strings {

    static int solve(String s1, String s2) {
        int n = s1.length();
        int res = 0;
        if (!s1.equals(s2)) {
            for (int i=0; i<n; i++) {
                if (s1.charAt(i) < s2.charAt(i)) {
                    res = -1;
                    break;
                }
                if (s1.charAt(i) > s2.charAt(i)) {
                    res = 1;
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().toLowerCase();
        String s2 = sc.nextLine().toLowerCase();
        System.out.println(solve(s1,s2));
    }
}
