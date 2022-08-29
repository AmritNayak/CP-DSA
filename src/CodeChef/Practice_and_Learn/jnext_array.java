package CodeChef.Practice_and_Learn;

import java.util.Arrays;
import java.util.Scanner;

public class jnext_array {

    static void nextGreater(int[] arr, int n) {
        int i;
        for (i = n-1; i > 0; i--) {
            if (arr[i] > arr[i-1])
                break;
        }
        if (i == 0)
            System.out.println("-1");
        else {
            int swap1 = arr[i-1];
            int min = i;
            for (int j=i+1; j<n; j++) {
                if (arr[j] > swap1 && arr[j] < arr[min])
                    min = j;
            }
            int temp = arr[i-1];
            arr[i-1] = arr[min];
            arr[min] = temp;
            Arrays.sort(arr,i,n);
            for (int x: arr)
                System.out.println(x + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            nextGreater(arr, n);
        }
    }
}
