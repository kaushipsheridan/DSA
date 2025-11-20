package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetII {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);  // important to handle duplicates
        List<List<Integer>> list = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), list);
        return list;
    }

    public void backtrack(int[] nums, int index, List<Integer> tempList, List<List<Integer>> list) {

        // Add the current subset to answer
        list.add(new ArrayList<>(tempList));

        for (int i = index; i < nums.length; i++) {

            // Skip duplicate values at the SAME recursion depth
            if (i > index && nums[i] == nums[i - 1]) continue;

            tempList.add(nums[i]);              // include current element

            backtrack(nums, i + 1, tempList, list);  // recurse

            tempList.remove(tempList.size() - 1);    // backtrack
        }
    }
    
}

