package BinarySearch;

public class kthMissingPositiveInteger {

    public static int findKthPositive(int[] arr, int k ){

        int left =0;
        int right = arr.length-1;

        //looping BS -> low will end up at the higher element 
        //high will end at the lower element and the missing element will be in between low and high always

        while(left<=right){
            int mid = left + (right-left)/2;

            //actual num missing at mid -> what is at mid - what should have been at mid
            int missingtillmid= arr[mid] - (mid+1);

            //now we need to check if missing till mid is less than k -> means the missing number if to the right of mid
            //else the missing number is at the left of mid

            if(missingtillmid<k){
                left = mid +1;
            }else{
                right = mid-1;
            } 

        }

        // //NOOB FORCE - WORKS BUT NOT ALWAYS

        // //now that we know that arr[high] will be at the lower end of the missing number 
        // //therefore
        // int temp = arr[right] - (right+1);

        // //now we need to see now far is temp from k and actually add the differnce in arr[high] for the answer
        // //so, this is what we need to add in arr[right] to get the ans
        // int tempans = k-temp;

        // return arr[right] + tempans; 


        //PRO FORCE - ALWAYS WORK - check notes

        return left+k;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,4,7,11};
        int k = 5;
        int rel = findKthPositive(nums,k);

        System.out.println(rel);
    }
    
}
