// Insertion Sort

// Insertion sort works by dividing the array into a sorted and unsorted part. It repeatedly takes the first element from the unsorted part and inserts it into the correct position in the sorted part.

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int currEle = arr[i];
            while (j >= 0 && arr[j] > currEle) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = currEle;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 15, 2, 4, 1, 23, 12, 2, 4, 11 };
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}