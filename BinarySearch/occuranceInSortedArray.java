package BinarySearch;

public class occuranceInSortedArray {

    public static int findOccurance(int [] nums, int target){

        int l=0;
        int r=nums.length-1;
        
        int lpos=-1;
        int rpos=-1;

        //finding left occurance
        while(l<=nums.length-1){
            if(nums[l]==target){
                lpos=l;
                break;
            }else{
                l++;
            }
        }

        //finding right occurance
        while(r>=0){
            if(nums[r]==target){
                rpos=r;
                break;
            }else{
                r--;
            }
        }

        //in case the element is not found 
        if(lpos ==-1 || rpos==-1){
            return-1;
        }

        return rpos-lpos+1;
    }
    public static void main(String[] args) {

        int[] arr ={2};
        int target = 4;

        System.out.println(findOccurance(arr, target));
        
    }
    
}
