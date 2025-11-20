package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class subsetI {

    public List<Integer> subsetSums(int[] nums) {
        //your code goes here
        int n= nums.length;
        Arrays.sort(nums);

        ArrayList<Integer> list = new ArrayList<>();
        subsetSumHelper(nums,list,n,0,0);
        Collections.sort(list);
        return list;
      
    }

    public void subsetSumHelper(int[] nums, ArrayList<Integer> arr, int n, int sum, int ind){

      //base case -> add the sum to final arr
      if(ind==n){
        arr.add(sum);
        return;
      }

      //picking an element
      subsetSumHelper(nums,arr, n, sum + nums[ind], ind+1);

      //not picking an element
      subsetSumHelper(nums,arr, n, sum , ind+1);


    }
}
    

