package Concepts;

public class insertionSorting {

    public static int[] insertionSort(int[] arr){

        for(int i=0;i<arr.length-1;i++){

            int j=i+1;

            while(j>0 && arr[j] < arr[j-1]){

                //SWAP
                int temp= arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;

                j--;
            }
   
        }

        return arr;

    }

    public static void main(String[] args) {
        int[] arr ={12,5,14,7,6,23,20};
        int[] sorted=insertionSort(arr);
        for(int i:sorted){
            System.out.println(i);
        }
    }
    
}
