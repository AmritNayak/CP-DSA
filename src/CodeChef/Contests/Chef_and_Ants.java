package CodeChef.Contests;

import java.util.Scanner;

public class Chef_and_Ants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0; i<t; i++) {
            //Sub Task for n = 1
            int n = sc.nextInt();
            int neg = 0, pos = 0;
            for (int j=0; j<n; j++) {
                int m = sc.nextInt();
                for (int k=0; k<m; k++)  {
                    int z = sc.nextInt();
                    if (z < 0)
                        neg++;
                    if (z > 0)
                        pos++;
                }
                System.out.println(neg*pos);
            }
        }
    }
}
