// Binary Search

// Binary Search is a fast and efficient algorithm used to find the position of a target value within a sorted array by repeatedly dividing the search interval in half.

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int first = 0;
        int last = arr.length;
        int mid = (first + last) / 2;

        while (first < last) {
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
            mid = (first + last) / 2;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6, 7, 8, 11, 12, 34 }; // Array must be sorted for binary search
        int target = 11;
        int idx = binarySearch(arr, target);
        if (idx != -1) {
            System.out.print("Element Found at index : " + idx);
        } else {
            System.out.println("Element not Found");
        }
    }
}