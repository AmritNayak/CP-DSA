package DSA.Sorting_and_Searching;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,2,1,0};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int partitionIndex = partition(arr, start, end);

            quickSort(arr, start, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int partitionIndex = left;
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                swap(arr, partitionIndex, j);
                partitionIndex++;
            }
        }
        swap(arr, partitionIndex, right);
        return partitionIndex;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
