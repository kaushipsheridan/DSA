package Concepts.SortingAlgos;

public class recursiveBubbleSort {

    public static void bubbleSortRecursive(int[] arr, int n){

        //handling best case - n=1
        if(n==1){
            return;
        }

        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp= arr[i+1];
                arr[i+1]= arr[i];
                arr[i]=temp;
            }
        }

        //calling bubble sort again - without the last element
        bubbleSortRecursive(arr, n-1);

    }

    public static void printArray(int[] arr){
        for(int z: arr){
            System.out.println(z);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        bubbleSortRecursive(arr, arr.length);
        System.out.print("Sorted array (Recursive): ");
        printArray(arr);
    }
    
}
