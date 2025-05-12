import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;



public class mergeOverlappingIntervals {


    public static int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, Comparator.comparingInt(i-> i[0]));

        //now that our solution can be as long as it can be, we will use Arraylist

        ArrayList<int[]> result = new ArrayList<>();

        //adding the first interval- to arraylist
        int[] prevInterval = intervals[0];

        result.add(prevInterval);

        for(int[] interval : intervals){
            //checking if prv's last and current's first are an interval
            if(interval[0] <= prevInterval[1]){

                //if found, replace the last of them as reuired
                prevInterval[1]= Math.max(prevInterval[1], interval[1]);

            }else{
                //this means that there is a break btw two intervals 
                prevInterval= interval;
                result.add(prevInterval);

            }

        }
        //chnaging form array list to int[][]
        return result.toArray(new int[result.size()][]);
    }
    
    public static void main(String[] args) {

        int[][] intervals = {{1, 3}, {2, 4}, {6, 8}, {9, 10}};
        int[][] sol = merge(intervals);

        for (int[] check : sol) {
             System.out.println(Arrays.toString(check));
        }


        
    }
}
