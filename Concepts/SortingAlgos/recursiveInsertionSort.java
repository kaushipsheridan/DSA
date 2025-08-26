package Concepts.SortingAlgos;

public class recursiveInsertionSort {


    public static void insertionSortRecursive(int[] arr, int n) {

        insertionSortRecursive(arr,n,1);

        
    }

    public static void insertionSortRecursive(int[] arr, int n,int i){

          if(i==n){
            return;
        }
        

        int j=i;
        while(j>0 && arr[j]<arr[j-1]){

            //perform swap
            int temp= arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            j--;

        }

        insertionSortRecursive(arr,n,++i);

    }


    public static void printArray(int[] arr){
        for(int z: arr){
            System.out.println(z);
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 1, 4, 2, 8};
        insertionSortRecursive(arr, arr.length);
        System.out.print("Sorted array (Recursive): ");
        printArray(arr);
        
    }
    
}



