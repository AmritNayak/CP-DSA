package CodeChef.Contests;

import java.util.Scanner;

public class Even_Differences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int even = 0, odd = 0;
            while (n-- != 0) {
                if (sc.nextInt() % 2 == 0)
                    even++;
                else
                    odd++;
            }
            if (even == 0 || odd == 0)
                System.out.println(0);
            else {
                if (even > odd)
                    System.out.println(odd);
                else if (even < odd)
                    System.out.println(even);
                else
                    System.out.println(even);
            }
        }
    }
}
