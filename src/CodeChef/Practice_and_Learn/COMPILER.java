package CodeChef.Practice_and_Learn;

import java.util.Scanner;

public class COMPILER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            String str = sc.nextLine();
            int a = 0, count = 0;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == '>')
                    a++;
                else
                    a--;
                if (a == 0)
                    count = i + 1;
                if (a < 0)
                    break;
            }
            System.out.println(count);
        }
    }
}
