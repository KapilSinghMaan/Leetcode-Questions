// Inversion Pair

// Let A[0,1,2,3.....n-1] be an array of n distinct positive integers. If i < j and  A[i] > A[j] then the pair (i,j) is called an inversion of A. Given n and an array A, your task is to find the number of inversions of A.

public class InversionPair {

    public static int count = 0;

    public static int[] mergeTwoSortedArrays(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int[] result = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
                count += (n - i);
            }
        }
        while (i < n) {
            result[k++] = a[i++];
        }
        while (j < m) {
            result[k++] = b[j++];
        }
        return result;
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
        if (start == end) {
            return;
        }
        int mid = (start + end) / 2;
        f(arr, start, mid);
        f(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    public static void mergeSort(int[] arr, int n) {
        f(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 8, 6, 1 };
        mergeSort(arr, arr.length);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
        System.out.println("\nNumber of inversion pairs are " + count);
    }
}