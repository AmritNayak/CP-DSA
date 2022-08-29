package DSA.Sorting_and_Searching;

import java.util.Arrays;

public class Insertion_Sort {

    static int[] insertionSort(int[] arr) {
        int length = arr.length;
        for (int i=1; i<length; i++) {
            // key to be inserted at right position
            int key = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > key) {
                // swapping
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,6,4,9,11,8};
        System.out.println("Unsorted: " + Arrays.toString(arr));
        System.out.println("Sorted: " + Arrays.toString(insertionSort(arr)));
    }
}
