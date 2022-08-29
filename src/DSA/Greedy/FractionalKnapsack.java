package DSA.Greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class FractionalKnapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] items = new double[n][3];
        for (int i = 0; i < n; i++) {
            // profit
            items[i][0] = sc.nextDouble();
            // weight
            items[i][1] = sc.nextDouble();
        }
        int capacity = sc.nextInt();
        double res = maxProfit(items, capacity);
        System.out.println("Max profit: " + res);

    }

    static double maxProfit(double[][] items, int capacity) {
        // Sort wrt to ratio profit : weight
        Arrays.sort(items, new Comparator<double[]>() {
            @Override
            public int compare(double[] o1, double[] o2) {
                // compare ratios for decreasing order
                return Double.compare(o2[0]/o2[1], o1[0]/o1[1]);
            }
        });

        double totalValue = 0;
        for (double[] item: items) {
            double profit = item[0];
            double weight = item[1];

            if (capacity > weight) {
                totalValue += profit;
                capacity -= weight;
            } else {
                double ratio = profit / weight;
                totalValue += capacity * ratio;
                break;
            }
        }

        return totalValue;
    }

}
