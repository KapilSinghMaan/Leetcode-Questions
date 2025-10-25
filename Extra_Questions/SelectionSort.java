// Selection Sort

// Selection sort is a simple, comparison-based sorting algorithm that works by repeatedly selecting the smallest (or largest) element from the unsorted portion of the array and placing it in its correct position.

public class SelectionSort {

    public static int findMinIndex(int[] arr, int start){
        int minIndex=start;
        for (int i = minIndex; i < arr.length; i++) {
            if (arr[i]<arr[minIndex]) {
                minIndex=i;
            }
        }
        return minIndex;
    }
 
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int minIndex=findMinIndex(arr,i);
            if (minIndex!=i) {
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={15,2,4,1,23,12,2,4,11};
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
}