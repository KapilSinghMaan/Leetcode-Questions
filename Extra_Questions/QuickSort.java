// Quick Sort

// Quick Sort is a divide-and-conquer sorting algorithm that selects a pivot element and partitions the array around it, recursively sorting the subarrays.

public class QuickSort {

    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static int partition(int[] arr,int l,int r,int pi)
    {
        int ele=arr[pi];
        swap(arr, pi, r);
        int m=l;
        for (int i = l; i <= r-1; i++) {
            if (arr[i]<ele) {
                swap(arr, m, i);
                m++;
            }
        }
        swap(arr, r, m);

        return m;
    }

    public static int randomPivotIdx(int l,int r){
        return (int)((Math.random()*(r-l)+l));
    }

    public static void f(int[] arr,int l,int r){
        if (l>r) {
            return;
        }
        int pivotIdx=randomPivotIdx(l, r);
        int x=partition(arr, l, r, pivotIdx);
        f(arr, l, x-1);
        f(arr, x+1, r);
    }

    public static void quickSort(int[] arr){
        f(arr,0,arr.length-1);
    }
    public static void main(String[] args) {
        int[] arr = { 2, 5, 2, -1, 11, 14, 9, 23, 34, 4, 55, 13 };
        quickSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
