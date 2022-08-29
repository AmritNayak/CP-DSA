package CodeChef.Practice_and_Learn;

import java.util.Scanner;

public class LAPIN {

    static boolean isPalindrome(String s) {
        int[] left = new int[26];
        int[] right = new int[26];
        int n = s.length();
        for (int i=0,j=n-1;i<j;i++,j--) {
            left[s.charAt(i)-'a']++;
            right[s.charAt(j)-'a']++;
        }
        for (int i=0; i<26; i++) {
            if (left[i] != right[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- != 0) {
            String s = sc.nextLine();
            if (isPalindrome(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
