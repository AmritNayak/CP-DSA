package Codeforces.Problem_Set;

import java.util.Scanner;

public class Bit_plus_plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        int x = 0;
        while (n-- > 0) {
            char c = sc.nextLine().charAt(1);
            if (c == '+')
                x++;
            else
                x--;
        }
        System.out.println(x);
    }
}
