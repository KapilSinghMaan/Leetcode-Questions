// Merging Two Sorted Arrays of different length into a single sorted array.

public class MergeTwoSortedArrays {

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
        int[] a = { 2, 4, 6, 8, 10 };
        int[] b = { 1, 3, 5, 7, 9, 11, 13, 21 };
        int[] arr = mergeTwoSortedArrays(a, b);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
