package BinarySearch;

public class searchInsertPosition {

    public static int findIt(int[] nums,int target){

        int left=0;
        int right=nums.length-1;
        int ans=nums.length;

        while(left<=right){

            int mid= left + (right-left)/2;

            if(nums[mid]==target){
                return mid;
            }else if ( nums[mid]<target){
                left = mid+1;
            }else{
                ans = mid;
                right = mid-1;
            }
        }

        return ans;
    }   

    public static void main(String[] args) {
        int[] arr = {1,3,4,6};
        int target=5;
        int ans= findIt(arr,target);
        System.out.println(ans);
    }
    
}
