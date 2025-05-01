import java.util.Arrays;

public class searchInSortedArray {

    public static int searchinRevSorted(int[] nums , int target){

        int left=0;
        int right = nums.length-1;


        while(left<=right){

            int mid = left + (right - left)/2;

            if(nums[mid]==target){
                return mid;
            }

            //first check if the left half is sorted or right half is sorted
            if(nums[mid] >= nums[left]){
                //if this condition is true -> its LEFT SORTED

                //therefore applying BINARY SORT ON THE LEFT
                if(nums[left] <= target && target <= nums[mid]){

                    right=mid-1;

                }else{
                    left=mid+1;
                }

            }else{

                //else -> array is RIGHT SORTED

                //therefore applying BINARY SORT ON THE RIGHT
                if(nums[mid] <= target && nums[right] >=target){
                    left = mid+1;
                }else{
                    right = mid-1;
                }

            }

        }

        return -1;
    }


    public static void main(String[] args) {

        int[] nums = {4,5,6,7,1,2,3};
        System.out.println(searchinRevSorted(nums, 6));
    


        
    }
}
