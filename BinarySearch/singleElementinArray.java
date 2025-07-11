package BinarySearch;

public class singleElementinArray {

    public static int singleNonDuplicate(int[] nums) {

        if(nums.length==1){
            return nums[0];
        }

        int left=0;
        int right=nums.length-1;
        int mid =0;

        while(left<=right){

            mid=left+ (right-left)/2;

            //we know -> Before unique num - pattern -> even,odd 
            //        -> After unique num - pattern -> odd,even
            
            if (mid < nums.length - 1 && nums[mid] == nums[mid + 1]){

                int temp= mid%2;

                 // if mid is even -> unique element is on right ----- if mid is odd - unique elem is on left
                if(temp!=0){

                    //therefore eliminate right side;
                    right =mid-1;
                }else{
                    //elminating left side
                    left=mid+2;
                }

            }else if ( mid>0 && nums[mid]==nums[mid-1]  ){

                int temp2= mid%2;

                // if mid is odd -> unique element is on right ----- if mid is even - unique elem is on left
                if(temp2!=0){
                    //therefore eliminate left side;
                    left=mid+1;
                }else{
                    //elminating right side
                    right=mid-2;
                }



            }else{
                //mid is the answer!
                return nums[mid]; 
            }


        }

        return nums[right];
    
            
    }

    public static void main(String[] args) {
        int[] nums = {3,3,7,7,10,11,11};
        int rel =   singleNonDuplicate(nums);
        System.out.println(rel);

    }
    
}
