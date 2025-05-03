public class nextPermutation {
    
    public static int[] nextPermutation(int[] nums) {


        int pivot = -1;

        //finding the pivot  ( where arr[i] < arr[i+1]) 
        for(int i = nums.length - 2 ; i >=0; i-- ){
            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }

        //IN A CASE -  where we couldn't find the pivot(this means that we are at the last lexicographic value), therefore 
        //next value must be same as the first lexicographic value -> therefore reverse the array
        //checking if pivot is still -1 -> if soo, reverse the array

        if(pivot==-1){
            int n = nums.length-1;
            for(int i=0; i<= n ;i++){
                int temp = nums[i];
                nums[i]= nums[n];
                nums[n]= temp; 
                n--;
               
            }
            return nums;
       }


        //now finding the right most element that is greater that pivot to swap
    

        for(int i = nums.length - 1 ; i > 0; i-- ){

            if(nums[i]> nums[pivot]){
                int temp = nums[pivot];
                nums[pivot]= nums[i];
                nums[i]=temp;
                break;
            }
        }

        //now making array from pivot +1 to end in accending order
        
       int i = pivot+1;
       int j = nums.length-1;

       while(i<=j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;

        i++;
        j--;
       }

       return nums;

        
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,6,5,4};
        int[] fixed = nextPermutation(nums);

        for(int i : fixed){
            System.out.println(i);
        }
    }
}
