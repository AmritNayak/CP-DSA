package CodeChef.Practice_and_Learn;

import java.util.Scanner;

public class Laddu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int activities = sc.nextInt();;
            String origin = sc.nextLine().trim();
            int laddu = 0;
            while (activities-- != 0) {
                String activity = sc.next();
                if (activity.equals("CONTEST_WON")) {
                    laddu += 300;
                    int rank = sc.nextInt();
                    if (rank > 20)
                        rank = 20;
                    laddu += (20 - rank);
                }
                else if (activity.equals("TOP_CONTRIBUTOR")){
                    laddu += 300;
                }
                else if (activity.equals("BUG_FOUND")) {
                    laddu += sc.nextInt();
                }
                else {
                    laddu += 50;
                }
                if (sc.hasNext())
                    sc.nextLine();
            }
            if (origin.equals("INDIAN"))
                laddu /= 200;
            else
                laddu /= 400;
            System.out.println(laddu);
        }
    }
}
