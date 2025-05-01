public class nextPermutation {
    
    public static int[] nextPermutation(int[] nums) {


        int pivot = -1;

        for(int i = nums.length - 2 ; i >=0; i-- ){
            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }

        //now finding the right most element that is greater that pivot to swap
    
        int lastnum=-1;

        for(int i = nums.length - 1 ; i >=0; i-- ){
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
        int[] nums = {3,2,1};
        int[] fixed = nextPermutation(nums);

        for(int i : fixed){
            System.out.println(i);
        }
    }
}
