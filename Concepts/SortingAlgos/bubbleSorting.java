package Concepts.SortingAlgos;

public class bubbleSorting {

    public static int[] bubbleSort(int[] arr){

        int n=arr.length;

        //Since after every loop, last value will be sorted , we remove it from the comparing window
        for(int i=n-1;i>=1;i--){    

            //OPTIMISED = Lets initialse a varible int didSwap to check if swapping is actually happening
            int didSwap=0;

            //inner loop to compare adjacent values - arr[j] and arr[j+1];
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    //if a larger value is found at arr[j] swap it with arr[j+1]
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    didSwap=1;
                }
            }

            //OPTIMISED - IF the array is already sorted - the didSwap would not change at all, therefore no need to check further
            if(didSwap==0){
                break;
            }

        }

        return arr;
        
    }

    public static void main(String[] args) {

        //int [] arr = {13,24,46,20,9,52};
        int [] arr = {1,2,3,4,5,6};
        int[] sorted = bubbleSort(arr);
        for(int i: sorted){
            System.out.println(i);
        }
        
    }
    
}
