package DSA.Sorting_and_Searching;

public class Binary_Search {

    static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (key == arr[mid])
                return  mid;
            else if (key < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        // array must be sorted for binary search
        int[] arr = {2,3,4,6,8,9,11};
        // prints index of element if found else -1
        System.out.println(binarySearch(arr, 6));
    }
}
