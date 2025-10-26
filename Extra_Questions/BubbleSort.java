// Bubble Sort

// Bubble Sort is a simple comparison-based sorting algorithm that works by repeatedly stepping through the list, comparing adjacent elements, and swapping them if they are in the wrong order.

class BubbleSort{
    public static void bubbleSort(int[] arr)
    {
        int n=arr.length;
        boolean isSwapped=false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwapped=true;
                }
            }
            if (!isSwapped) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={15,2,4,1,23,12,2,4,11};
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}