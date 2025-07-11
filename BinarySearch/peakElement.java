package BinarySearch;

public class peakElement {

    public static int findPeakElement(int[] nums) {

        if(nums.length==1){
            return 0;
        }

        int left=0;
        int right =nums.length-1;
        int mid =0;

        while(left<=right){

            mid = left+ (right-left)/2;

            //handling left at 0
            if(left==0 && nums[left] > nums[left+1]){
                return left;
            }else if (nums[left]<nums[left+1]){
                left++;
            }

            //handling right at nums.length-1;

            if( right == nums.length-1 && nums[right]>=nums[right-1]){
                return right;
            }else if (nums[right]<nums[right-1]){
                right--;
            }


            //checking mid too
            if(nums[mid]>nums[mid+1] && nums[mid-1]<nums[mid]){
                return mid;
            }


        }

        return mid;
        
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int rel = findPeakElement(nums);
        System.out.println(rel);
    
}}
