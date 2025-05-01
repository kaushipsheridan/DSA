import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Approach is good - IDEAL would be using Sliding window - Will cover that one later

public class choclateDistributionProblem {

    public static int sortitout(ArrayList<Integer> arr, int m ){

        int mindiff= Integer.MAX_VALUE;

        Collections.sort(arr);

        int n = arr.size();

        for (int i =0; m-1+i < n; i++){

            int result = arr.get(m - 1 + i) - arr.get(i);

            if ( result < mindiff) {
                mindiff = result;
            }

        }

        return mindiff;
    }

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.addAll(Arrays.asList(7, 3, 2, 4, 9, 12, 56));
        
        int m =3;
        System.out.println(sortitout(arr,m));
        
    }
    
}
