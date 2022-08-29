package CodeChef.Contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chef_and_Meetings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            StringBuilder ans = new StringBuilder();
            String[] p = br.readLine().split(":|\\s");
            int pHour = Integer.parseInt(p[0]), pMin = Integer.parseInt(p[1]);
            if (p[2].equals("AM") && p[0].equals("12"))
                pHour = 0;
            if (p[2].equals("PM") && !p[0].equals("12"))
                pHour += 12;
            int x = pHour * 60 + pMin;
            int n = Integer.parseInt(br.readLine());
            while (n-- != 0) {
                String[] q = br.readLine().split(":|\\s");
                int lHour = Integer.parseInt(q[0]);
                int lMin = Integer.parseInt(q[1]);
                int rHour = Integer.parseInt(q[3]);
                int rMin = Integer.parseInt(q[4]);
                if (q[2].equals("AM") && q[0].equals("12"))
                    lHour = 0;
                if (q[5].equals("AM") && q[3].equals("12"))
                    rHour = 0;
                if (q[2].equals("PM") && !q[0].equals("12"))
                    lHour += 12;
                if (q[5].equals("PM") && !q[3].equals("12"))
                    rHour += 12;
                int a = lHour * 60 + lMin;
                int b = rHour * 60 + rMin;
                if (a <= x && x <= b)
                    ans.append(1);
                else
                    ans.append(0);
//                if (pHour == lHour || pHour == rHour) {
//                    if (pMin < lMin || pMin > rMin)
//                        ans.append("0");
//                    else
//                        ans.append("1");
//                }
//                else if (pHour < lHour || pHour > rHour)
//                    ans.append("0");
//                else {
//                    ans.append("1");
//                }
            }
            System.out.println(ans);
        }
    }
}
