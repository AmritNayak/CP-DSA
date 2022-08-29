package Codeforces.Contests;

import java.util.Scanner;

public class Space_Navigation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int px = sc.nextInt(), py = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int n = s.length();
            char xchar, ychar;
            boolean xb = false, yb = false;
            if (px <= 0) xchar = 'L';
            else xchar = 'R';
            if (py <= 0) ychar = 'D';
            else ychar = 'U';
            px = Math.abs(px);
            py = Math.abs(py);
            if (px == 0) xb = true;
            if (py == 0) yb = true;
            for (int i=0; i<n; i++) {
                if (s.charAt(i) == xchar && !xb) px--;
                if (s.charAt(i) == ychar && !yb) py--;
                if (px == 0) xb = true;
                if (py == 0) yb = true;
                if (xb && yb) break;
            }
            System.out.println((xb && yb) ? "YES" : "NO");
        }
    }
}
