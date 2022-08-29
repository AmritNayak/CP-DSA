package DSA.Greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ActivitySelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] activities = new int[n][2];

        for (int i=0; i<n; i++) {
            // start time
            activities[i][0] = sc.nextInt();
            // finish time
            activities[i][1] = sc.nextInt();
        }

        int res = getActivities(activities);
        System.out.println("Number of ativities: " + res);

    }

    static int getActivities(int[][] activities) {
        Arrays.sort(activities, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                // compare finish times of activities
                return o1[1] - o2[1];
            }
        });

        int count = 0;
        int end = -1;
        for (int[] activity: activities) {
            if (activity[0] >= end) {
                count++;
                end = activity[1];
            }
        }

        return count;
    }

}
