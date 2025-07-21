package BinarySearch;
import java.util.*;

public class aggressiveCows {

    public static int ArrangeCows(int[] arr, int cows){

        Arrays.sort(arr);

        //now we know the min possible distance btw cows can be 1 and the max can be the last element -first one
        //therfore possible distances are 1-max-min
        int left = 1;
        int right = arr[arr.length-1] - arr[0];

        int maxpos=Integer.MIN_VALUE;

        while(left<=right){

            int mid = left + (right-left)/2;

            if(canWeArrange(arr,cows,mid)){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }

        return right;
    }

    public static boolean canWeArrange(int[] arr, int cows, int dist){

        int cowcount=1; 
        int prevcow=arr[0];

        for(int i =1;i<arr.length;i++){

         
            if(arr[i]- prevcow>=dist){
                cowcount++;
                prevcow=arr[i];
            }

            if(cowcount>=cows){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {0,3,4,7,9,10};
        int cows =4;

        System.out.println(ArrangeCows(arr,cows));
    }
    
}
