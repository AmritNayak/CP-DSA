package DSA.Sorting_and_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length-1);
    }

    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);

            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

//        int[] lArr = Arrays.copyOfRange(arr, left, n1);
//        int[] rArr = Arrays.copyOfRange(arr, mid+1, n2);

        int[] lArr = new int[n1];
        int[] rArr = new int[n2];
        for (int i = 0; i < n1; i++) {
            lArr[i] = arr[left+i];
        }
        for (int i = 0; i < n2; i++) {
            rArr[i] = arr[mid+i+1];
        }

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (lArr[i] <= rArr[j])
                arr[k++] = lArr[i++];
            else
                arr[k++] = rArr[j++];
        }
        while (i < n1)
            arr[k++] = lArr[i++];
        while (j < n2)
            arr[k++] = rArr[j++];

    }

}
