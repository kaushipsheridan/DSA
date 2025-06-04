package Concepts;

public class selectionSorting {

    public static int[] sortIt(int[] arr){

        for(int i=0;i<arr.length-1;i++){

            //setting variable for the index of min value;
            int minValueIndex=i;

            //loop to get the min value;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[minValueIndex]){
                    minValueIndex=j;
                }
            }

            //now swapping - the min value with ith value
            int temp = arr[i];
            arr[i]=arr[minValueIndex];
            arr[minValueIndex]=temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {75,3,59,42,74,6,50};
        int[] result = sortIt(arr);

        for(int i: result){
            System.out.println(i);
        }
    }
    
}
