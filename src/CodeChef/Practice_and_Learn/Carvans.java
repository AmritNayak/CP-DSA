package CodeChef.Practice_and_Learn;

import java.util.Arrays;
import java.util.Scanner;

class Carvans {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test_cases = sc.nextInt();
        for (int i = 0; i < test_cases; i++) {
            int cars = sc.nextInt();
            int max = 1;
            int[] speed = new int[cars];
            for (int j = 0; j < cars; j++) {
                speed[j] = sc.nextInt();
            }
            System.out.println(Arrays.toString(speed));
            for (int k = 1; k < cars; k++) {
                if (speed[k] > speed[k-1])
                    speed[k] = speed[k-1];
                else
                    max++;
            }
            System.out.println(Arrays.toString(speed));
            System.out.println(max);
        }
    }
}
