// Merge Sort

// Merge Sort is a divide-and-conquer algorithm that splits an array into halves, recursively sorts each half, and then merges them back together in sorted order. It has a consistent time complexity of O(n log n) and is known for being stable and efficient, especially with large datasets.

public class MergeSort {

    public static int[] mergeTwoSortedArrays(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int[] ar = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                ar[k++] = a[i];
                i++;
            } else {
                ar[k++] = b[j];
                j++;
            }
        }
        while (i < n) {
            ar[k++] = a[i++];
        }
        while (j < m) {
            ar[k++] = b[j++];
        }
        return ar;
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int[] left = new int[mid - start + 1];
        int[] right = new int[end - mid];
        int k = 0;
        for (int i = start; i <= mid; i++) {
            left[k++] = arr[i];
        }
        k = 0;
        for (int i = mid + 1; i <= end; i++) {
            right[k++] = arr[i];
        }

        int[] result = mergeTwoSortedArrays(left, right);

        k = 0;
        for (int i = start; i <= end; i++) {
            arr[i] = result[k++];
        }
    }

    public static void f(int[] arr, int start, int end) {
        if (end <= start) {
            return;
        }
        int mid = (start + end) / 2;
        f(arr, start, mid);
        f(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    public static void mergeSort(int[] arr) {
        f(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, -2, 23, 2, 45, 6, 10, 4 };
        mergeSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}