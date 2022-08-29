package CodeChef.Contests;

import java.util.Scanner;

public class EASYABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        char[] a = s.toCharArray();
        int c1=0,c2=0;
        for (int i=0; i<n; i++) {
            if (a[i] != a[n-1]) {
                c1 = n-1-i;
                break;
            }
        }
        for (int j=n-1; j>=0; j--) {
            if (a[0] != a[j]) {
                c2 = j;
                break;
            }
        }
        System.out.println(Math.max(c1,c2));
    }
}
