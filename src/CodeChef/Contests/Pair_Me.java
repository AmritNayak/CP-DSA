package CodeChef.Contests;

import java.util.Scanner;

public class Pair_Me {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int sum = x + y + z;
            if (sum % 2 == 1)
                System.out.println("NO");
            else {
                sum /= 2;
                if (x == sum || y == sum || z == sum)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}
