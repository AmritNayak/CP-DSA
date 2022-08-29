package Codeforces.Contests;

import java.util.Scanner;

public class Yet_Another_String_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();sc.nextLine();
        while (t-- != 0) {
            String s = sc.nextLine(), ans = "";
            int n = s.length();
            for (int i=0; i<n; i++) {
                if ((i & 1) == 0) {
                    if (s.charAt(i) == 'a') ans += 'b';
                    else ans += 'a';
                }
                else {
                    if (s.charAt(i) == 'z') ans += 'y';
                    else ans += 'z';
                }
            }
            System.out.println(ans);
        }
    }
}
