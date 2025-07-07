package BinarySearch;

public class firstAndLastinSortedArra{

    public static int[] searchRange(int[] nums, int target) {

        int l=0;
        int r= nums.length-1;
        int rel[]={-1,-1};
    

        while(l<=nums.length-1){

            if(nums[l]==target){
                rel[0]=l;
                break;
            }else{
                l++;
            }

        }

        while(r<=nums.length-1){
            if(nums[r]==target){
                rel[1]=r;
                break;
            }else{
                r--;
            }
        }

        return rel;
    }

    public static void main(String[] args) {
        int[] arr = {5,6,7,8,8,10};
        int target=8;

        for(int i: searchRange(arr,target)){
            System.out.println(i);  
        }
    }
    
}
