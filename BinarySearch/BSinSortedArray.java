package BinarySearch;

public class BSinSortedArray {

    public static int BSinSortedNow(int[] nums, int target){

        int left=0;
        int right=nums.length-1;
       

        while(left<right){

             int mid= left + (right-left)/2;

             if(target>nums[mid]){
                left=mid+1;
             }else if ( target<nums[mid]){
                right = mid-1;
             }else{ 
                return mid;
             }

        }

        return -1;
    }


    public static void main(String[] args) {
         int[] arr = {-1,0,3,5,9,12};
         int target= 4;
         int ans = BSinSortedNow(arr,target);
         System.out.println(ans);
    }

   
    
}
