package CSES_Problem_Set;

import java.util.Scanner;

public class Missing_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n * (n+1) / 2;
        int queriesSum = 0;
        for (int i=0; i<n-1; i++)
            queriesSum += sc.nextInt();
        System.out.println(sum - queriesSum);
    }
}
