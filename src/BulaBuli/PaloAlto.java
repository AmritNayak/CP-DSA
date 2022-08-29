package BulaBuli;

import java.util.Scanner;

class PaloAlto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int m = sc.nextInt(), n = sc.nextInt(), len = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            char[][] mat = new char[m][n];
            formSpiralMatrix(mat, m, n, s.toCharArray(), len);
            printSpiralMatrix(mat, m, n);
        }
    }

    static void printSpiralMatrix(char[][] mat, int r, int c) {
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
                System.out.print(mat[i][j] );
            System.out.println();
        }
    }

    static void formSpiralMatrix(char[][] mat, int r, int c, char[] arr, int n) {
        int top = 0, bottom = r - 1, left = 0, right = c - 1;
        int index = 0;

        while (true) {
            if (left > right)
                break;

            for (int i = left; i <= right; i++)
                mat[top][i] = arr[(index++)%n];
            top++;

            if (top > bottom)
                break;

            for (int i = top; i <= bottom; i++)
                mat[i][right] = arr[(index++)%n];
            right--;

            if (left > right)
                break;

            for (int i = right; i >= left; i--)
                mat[bottom][i] = arr[(index++)%n];
            bottom--;

            if (top > bottom)
                break;

            for (int i = bottom; i >= top; i--)
                mat[i][left] = arr[(index++)%n];
            left++;
        }
    }
}
