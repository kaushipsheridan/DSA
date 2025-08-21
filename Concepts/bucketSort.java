package Concepts;

import java.util.*;

public class bucketSort {

    public static void bucketSort(int[] arr, int bucketCount){

        //if array length is 0 -> WHAT IS THERE TO SORT?????
         if (arr.length == 0) return;

        int minVal=arr[0];
        int maxVal=arr[0];

        //GET MIN ND MAX VALUE FIRST
        for(int i : arr){
            if(i>maxVal) maxVal=i;
            if(i<minVal) minVal=i;
        }

        //STEP 1 Create Bucket ------------------------------------------

            int range = (maxVal-minVal +1);

            //establishing size of each bucket required
            int bucketSize = (int)Math.ceil((double)range/bucketCount);

            //Creating an array list called buckets -
            List<Integer>[] buckets = new ArrayList[bucketCount];

            //then putting an another array list on every single index 
            for(int i=0;i<bucketCount;i++){
                buckets[i]= new ArrayList<>();
            }
        
        
        //Step 2 
            


        
    }
    public static void main(String[] args) {
         int[] arr = {42, 32, 23, 52, 25, 47, 51};
        bucketSort(arr, 5); // using 5 buckets
        System.out.println("OUTPUT->" +  Arrays.toString(arr));
    }
}
