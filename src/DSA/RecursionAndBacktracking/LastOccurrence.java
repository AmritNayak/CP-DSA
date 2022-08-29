package DSA.RecursionAndBacktracking;

public class LastOccurrence {
    public static void main(String[] args) {
        int[] arr = {2,3,6,9,8,3,2,6,2,4};
        System.out.println(lastOccurrence(arr, 0, 6));
    }

    static int lastOccurrence(int[] arr, int idx, int data) {
        if (arr.length == idx)
            return -1;

        int last = lastOccurrence(arr, idx+1, data);
        if (last == -1) {
            if (arr[idx] == data)
                return idx;
            return -1;
        }
        return last;
    }
}
