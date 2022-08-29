package DSA.RecursionAndBacktracking;

public class FirstOccurrence {
    public static void main(String[] args) {
        int[] arr = {2,3,6,9,8,3,2,6,2,4};
        System.out.println(firstOccurrence(arr, 0, 6));
    }

    static int firstOccurrence(int[] arr, int idx, int data) {
        if (idx == arr.length)
            return -1;

        if (arr[idx] == data)
            return idx;

        return firstOccurrence(arr, idx + 1, data);

    }
}
