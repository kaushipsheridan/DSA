package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class findRowWithMax1 {

    public static int lowerBound(ArrayList<Integer> arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr.get(mid) >= x) {
                ans = mid;
                // look for smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }

    public static int rowWithMax1s(ArrayList<ArrayList<Integer>> arr , int n, int m){

        int countmax=-1;

        //indx to track which row has the highest
        int indx=-1;
        
        for(int i=0;i<n;i++){

            int countCurr= m - lowerBound(arr.get(i), m, 1);

            //checking if the max has been updated
            if(countCurr>countmax){
                countmax=countCurr;
                indx=i;
            }

        }

        return indx;


    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(0, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(0, 0, 0)));

        int n = 3, m = 3;
        System.out.println(rowWithMax1s(matrix, n, m));
    }
    
}
