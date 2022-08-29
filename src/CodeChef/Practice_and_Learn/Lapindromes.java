package CodeChef.Practice_and_Learn;

import java.util.Scanner;

class Lapindromes {

    static int MAX_LETTERS = 26;

    static boolean isLapindrome(String s) {
        int[] left_count = new int[MAX_LETTERS];
        int[] right_count = new int[MAX_LETTERS];
        if (s.length() == 1)
            return true;
        for (int i = 0, j = s.length()-1; i < j; i++, j--) {
            left_count[s.charAt(i) - 'a']++;
            right_count[s.charAt(j) - 'a']++;
        }
        for (int i = 0; i < MAX_LETTERS; i++)
            if (left_count[i] != right_count[i])
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int text_cases = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < text_cases; i++) {
            if (isLapindrome(sc.nextLine()))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
