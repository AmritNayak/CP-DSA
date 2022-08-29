package CodeChef.Practice_and_Learn;

import java.util.Scanner;

class ReverseTheNumber {

    static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_cases = sc.nextInt();
        for (int i = 0; i < test_cases; i++) {
            System.out.println(reverse(sc.nextInt()));
        }
    }
}
