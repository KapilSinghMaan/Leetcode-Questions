// Linear Search

// Linear Search is a simple search algorithm that checks each element in a list sequentially until the desired value is found or the end of the list is reached.

public class LinearSearch {

    public static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 6, 7, 3, 4, 12, 11, 2, 34 };
        int target = 11;
        int idx = linearSearch(arr, target);
        if (idx != -1) {
            System.out.print("Element Found at index : " + idx);
        } else {
            System.out.println("Element not Found");
        }
    }
}