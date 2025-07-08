package BinarySearch;

public class searchInRotatedSortedArray2 {

    public static boolean search(int[] nums, int target) {
    int left = 0, right = nums.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (nums[mid] == target) return true;

        // If duplicates make it unclear which half is sorted
        if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
            left++;
            right--;
        } 
        // Left half is sorted
        else if (nums[left] <= nums[mid]) {
            if (target >= nums[left] && target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        } 
        // Right half is sorted
        else {
            if (target > nums[mid] && target <= nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }

    return false;
}

    public static boolean BS(int[] nums, int left, int right, int target){

        while(left<=right){

            int mid = left + (right-left)/2;

            if(nums[mid]==target){
                return true;
            }

            //now we dont know what section of the input array here will be sorted 
            //therfore 

            if(nums[left]<=nums[mid]){

                //ARRAY IS LEFT SORTED
                    //therfore target is in the right half
                    if(target>=nums[left] && target <= nums[mid]){
                        right = mid-1;
                    }else{
                    left = mid+1;
                    }

            }else if ( nums[left]> nums[mid]){

                //ARRAY IS RIGHT SORTED
                 //therfore target is in the right half
                if(target>=nums[mid] && target <= nums[right]){
                    left = mid+1;                  
                }else{
                     right = mid-1;   
                }

                // nums[left] == nums[mid], cannot decide, skip duplicate
            }else{
                left++;
            }
          
            
        }

        return false;


        
    }

    public static void main(String[] args) {

        int[] nums = {1,0,1,1,1};
        System.out.println(search(nums, 0));
    
        
    }
    
}
