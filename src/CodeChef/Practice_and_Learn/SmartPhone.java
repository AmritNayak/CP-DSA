package CodeChef.Practice_and_Learn;

import java.util.Arrays;
import java.util.Scanner;

class SmartPhone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_cases = sc.nextInt();
        long[] arr = new long[test_cases];
        for (int i = 0; i < test_cases; i++) {
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);
        long revenue = 0;
        for (int i = 0; i < test_cases; i++) {
            revenue = Math.max(revenue, arr[i]*(test_cases-i));
        }
        System.out.println(revenue);
    }
}
