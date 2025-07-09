package BinarySearch;

public class numberOfTimesArrayRotated {

    public static int findKRotation(int[] nums){


        //eg - Array = {[4,5,6,7,0,1,2,3]} has been roatated 4 times
        //index of min value = 4
        //therefore essentially we need to find the index of the min val

        int left=0;
        int right=nums.length-1;

        while(left<=right){

            int mid= left + (right-left)/2;

             if (nums[mid] > nums[right]) {
                left = mid + 1; // Minimum is in the right half
            } else {
                right = mid; // Minimum is at mid or to the left
            }
        }
        


        return nums[left];
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        int ans = findKRotation(arr);
        System.out.println("hehe");
        System.out.println("The array is rotated " + ans + " times.");
    }
}
