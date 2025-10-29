// Merge Sort

// Merge Sort is a divide-and-conquer algorithm that splits an array into halves, recursively sorts each half, and then merges them back together in sorted order. It has a consistent time complexity of O(n log n) and is known for being stable and efficient, especially with large datasets.

public class MergeSort {
    public static int[] mergeTwoSortedArrays(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int[] arr = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                arr[k++] = a[i];
                i++;
            } else {
                arr[k++] = b[j];
                j++;
            }
        }
        while (i < n) {
            arr[k++] = a[i++];
        }
        while (j < m) {
            arr[k++] = b[j++];
        }
        return arr;
    }

    public static void main(String[] args) {
        
    }
}