package Recursion;

import java.util.ArrayList;
import java.util.List;

public class printSubset {

    public static void printSubsets(int[] nums, int index, List<Integer> current, List<List<Integer>> result){

        //base case
        if(index==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }

        //CASE OF INCLUSION
        current.add(nums[index]);
        //recursively calling printSubset
        printSubsets(nums, index+1, current, result);

        //CASE OF EXCLUSION
        current.remove(current.size()-1); //removing last added element
        printSubsets(nums, index+1, current, result);
        


    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();

        printSubsets(nums, 0, new ArrayList<>(), result);

        // Print all subsets
        System.out.println("All subsets:");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
    
}
