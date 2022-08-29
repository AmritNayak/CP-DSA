package CodeChef.Contests;

import java.util.Scanner;

public class Even_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            long even = 0, odd = 0;
            while (n-- != 0) {
                if (sc.nextLong()%2==0)
                    even++;
                else
                    odd++;
            }

            if (odd % 2 == 1)
                System.out.println(2);
            else
                System.out.println(1);

        }
    }
}
