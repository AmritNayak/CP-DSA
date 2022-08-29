package DSA.Divide_and_Conquer;

import java.util.*;

public class ClosestPairOfPoints {

    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point[] points = new Point[n];
        for (int i=0; i<n; i++) {
            points[i] = new Point(sc.nextInt(), sc.nextInt());
        }
        double closestPointsDistance = closest(points, points.length);
        System.out.println("Least Distance: " + closestPointsDistance);
    }

    static double closest(Point[] points, int n) {
        sortX(points);
        Point[] copy = Arrays.copyOfRange(points, 0, n);
        sortY(copy);
        return closestUtil(points, copy, n);
    }

    static double closestUtil(Point[] pointsX, Point[] pointsY, int n) {
        if (n <= 3)
            return bruteForce(pointsX, n);

        int mid = n / 2;
        Point midPoint = pointsX[mid];

        Point[] leftPoints = Arrays.copyOfRange(pointsX, 0, mid);
        Point[] rightPoints = Arrays.copyOfRange(pointsX, mid, n);

        double dLeft = closestUtil(leftPoints, pointsY, mid);
        double dRight = closestUtil(rightPoints, pointsY, n - mid);

        double d = Math.min(dLeft, dRight);

        List<Point> stripP = new ArrayList<>();
        List<Point> stripQ = new ArrayList<>();
        List<Point> temp = new ArrayList<>();
        temp.addAll(Arrays.asList(leftPoints));
        temp.addAll(Arrays.asList(rightPoints));

        for (int i = 0; i < n; i++) {
            if (Math.abs(temp.get(i).x - midPoint.x) < d)
                stripP.add(temp.get(i));
            if (Math.abs(pointsY[i].x - midPoint.x) < d)
                stripQ.add(pointsY[i]);
        }

        stripP.sort(new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return o1.y - o2.y;
            }
        });

        double min1 = Math.min(d, stripClosest(stripP, stripP.size(), d));
        double min2 = Math.min(d, stripClosest(stripQ, stripQ.size(), d));

        return Math.min(min1, min2);
    }

    static double bruteForce(Point[] points, int n) {
        double min = Double.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                double temp = distance(points[i], points[j]);
                if (temp < min) {
                    min = temp;
                }
            }
        }
        return min;
    }

    static double stripClosest(List<Point> strip, int size, double d) {
        double min = d;
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size && (strip.get(j).y - strip.get(i).y < min); j++) {
                if (distance(strip.get(i), strip.get(j)) < min) {
                    min = distance(strip.get(i), strip.get(j));
                }
            }
        }
        return min;
    }

    static void sortX(Point[] points) {
        Arrays.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return o1.x - o2.x;
            }
        });
    }

    static void sortY(Point[] points) {
        Arrays.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return o1.y - o2.y;
            }
        });
    }

    static double distance(Point p1, Point p2) {
        return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
    }
}
