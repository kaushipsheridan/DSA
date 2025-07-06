package BinarySearch;

public class lowerBoundInBS {

    public static int findIt(int[] nums, int target){

        int left=0;
        int right=nums.length;
        int tempindex=nums.length+1;

        while(left<=right){

            int mid= left + (right-left)/2;
            if(nums[mid]>=target){
                tempindex=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }

        return tempindex;

        
    }
    
    public static void main(String[] args) {
        int[] arr={3,5,8,15,19};
        int target= 9;
        int ans= findIt(arr, target);

        System.out.println(arr[ans]);
    }
}
