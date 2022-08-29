package DSA.RecursionAndBacktracking;

import java.util.Arrays;

public class AllOccurrences {
    public static void main(String[] args) {
        int[] arr = {2,3,6,9,8,3,2,3,6,2,4};
        System.out.println(Arrays.toString(allOccurrences(arr, 3, 0, 0)));
    }

    static int[] allOccurrences(int[] arr, int data, int idx,int foundSoFar) {
        if (idx == arr.length) {
            return new int[foundSoFar];
        }
        int[] iArr;
        if (arr[idx] == data) {
            iArr = allOccurrences(arr, data, idx + 1, foundSoFar + 1);
            iArr[foundSoFar] = idx;
        } else {
            iArr = allOccurrences(arr, data, idx + 1, foundSoFar);
        }
        return iArr;
    }
}
