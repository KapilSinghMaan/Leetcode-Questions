// Counting Sort

// Counting Sort is a non-comparison-based sorting algorithm that organizes elements by counting their occurrences and using that count to determine their positions in the sorted array.

public class CountingSort {

    public static int[] countingSort(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int i : arr) {
            if (i>max) {
                max=i;
            }
        }
        int[] result=new int[arr.length];
        int[] fre=new int[max+1];

        for (int i = 0; i < arr.length; i++) {
                fre[arr[i]]+=1;
        }
        for (int i = 1; i < fre.length; i++) {
            fre[i]+=fre[i-1];
        }

        for (int i = arr.length-1; i >=0; i--) {
            result[--fre[arr[i]]]=arr[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr={3,2,1,4,3,2,5,4,2,1,0,4};
        int[] output=countingSort(arr);
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]+" ");
        }
    }
    
}