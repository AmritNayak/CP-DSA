package CodeChef.Practice_and_Learn;

import java.util.Scanner;

public class CSUB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  t= sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            long count = 0;
            for (int i=0; i<n; i++) {
                if (s.charAt(i)=='1')
                    count++;
            }
            count = count * (count + 1) / 2;
            System.out.println(count);
        }
    }
}
