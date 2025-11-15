package Recursion;

public class countAllSubsequenceWithSumK {

    public static boolean countSubsequenceWithTargetSum(int[] nums, int target){

        return helper(nums,0,0,target,0);
    }

    public static boolean helper(int[] nums, int index, int sum, int target, int taken){

        //base case
        if(index==nums.length){
           return (sum==target && taken>0);
        }
        
        //including number at nums[index]
        boolean take = helper(nums, index+1, sum+ nums[index], target, taken+1);

        // If the "take" branch found a valid subsequence (sum == target),
        // it returns true from deeper recursion.
        // Since we only need ONE valid subsequence,
        // we immediately return true without exploring further.
        if(take) return true;

        //excluding the number at nums[index]
        boolean nottake = helper(nums, index+1, sum, target, taken);

        //this check non inclusive brances , if true-> return true else false
        return nottake;



    

    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 4};
        int target = 5;
        System.out.println("Number of subsequences with target sum " + target + ": "
                + countSubsequenceWithTargetSum(nums1, target));
        
    }
    
}
