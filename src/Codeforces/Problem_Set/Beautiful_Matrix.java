package Codeforces.Problem_Set;

import java.util.Scanner;

public class Beautiful_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                int a = sc.nextInt();
                if (a == 1)
                    System.out.println(Math.abs(i-2) + Math.abs(j-2));
            }
        }
    }
}
