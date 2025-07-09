package BinarySearch;

public class searchInRotatedSortedArray2 {

    public static boolean search(int[] nums, int target) {
    int left = 0, right = nums.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (nums[mid] == target) return true;

        // If duplicates make it unclear which half is sorted - SKIP THEM
        if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
            left++;
            right--;
        } 

        // Left half is sorted
        else if (nums[left] <= nums[mid]) {
            //BS on LEFT
            if (target >= nums[left] && target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        } 
        // Right half is sorted
        else {

            //BS ON RIGHT
            if (target > nums[mid] && target <= nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }

    return false;
}


    public static void main(String[] args) {

        int[] nums = {1,0,1,1,1};
        System.out.println(search(nums, 0));
    
        
    }
    
}
