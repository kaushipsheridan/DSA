package Recursion;

import java.util.ArrayList;
import java.util.List;

public class combinationSumTwo {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> list = new ArrayList<>();

        backtrack(list, new ArrayList(), candidates, target,0);

        return list;
    }
   public void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int remain, int index){

        //if remains goes below 0 -> invalid pairs -> ignore it
        if(remain<0){
            return;
        }else if (remain ==0){
            //VALID SET FOUND
            list.add(new ArrayList<>(tempList));
        }else{

            //now we will play with backtrack, since a single element can come multiple times
            //we will also use a for loop with backtracking(recursion) logic

            for(int i=index;i<nums.length;i++){

                //adding the num to tempList;
                tempList.add(nums[i]);

                //backtracking ( note that here we will give i + 1 as copies in set are not allowed)
                backtrack(list,tempList,nums,remain-nums[i],i+1);

                //now removing the nums(last element) from the list for substituting
                tempList.remove(tempList.size()-1);
            }
        }
    }
}

