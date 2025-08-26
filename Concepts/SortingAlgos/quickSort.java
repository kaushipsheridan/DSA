package Concepts.SortingAlgos;

public class quickSort {


    public static int partition(int[] arr, int start, int end){

        int pivotIndex=start-1;
        int pivot=arr[end];

        for(int j=start;j<end;j++){

            //SEMI SORTING ARRAY towards the LEFT and RIGHT of the PIVOT
                if(arr[j]<=pivot){

                    //Moving Pindex by one
                    pivotIndex++;

                    //swap arr[j] with arr[pivotIndex]
                    int temp=arr[j];
                    arr[j]= arr[pivotIndex];
                    arr[pivotIndex]=temp;

                }
        }

            // NOW adding PIVOT to appropriate place an returning its index

                //increase pivot index by one to make space
                pivotIndex++;
                
                //swap arr[end](which is actually pivot) with arr[pivotIndex]
                int temp2=arr[end];
                arr[end]=arr[pivotIndex];
                arr[pivotIndex]=temp2; 

        //now that pivot is at its actual place, returning its index
        return pivotIndex;
    }

    public static void quickSortit(int[] arr, int start, int end){

        if(start<end){

            //This will call partition function to perfrom the partitional sorting
            int partIndex=partition(arr,start,end);

            //Also call quick sort again for the LEFT semi sorted array
            quickSortit(arr, start, partIndex-1);
        
            //And for the RIGHT sorted array
            quickSortit(arr, partIndex+1, end);

        } 
       
    }

    public static void main(String[] args) {

        int[] arr ={12,5,14,7,6,23,20};
        quickSortit(arr,0,arr.length-1);
        for(int i:arr){
            System.out.println(i);
        }
   
    }
    
}
