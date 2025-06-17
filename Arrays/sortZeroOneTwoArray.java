public class sortZeroOneTwoArray {


    public static void sortItNow(int[] nums){
        int left=0;
        int mid=0;
        int right=nums.length-1;

        while(mid<=right){

            if(nums[mid]==1){
                //do nothing 
                mid++;
                
            }else if(nums[mid]==0){

                //swap with left - inc mid as we are sorting from left to right : therefore the left is already sorted 
                int temp=nums[left];
                nums[left]=nums[mid];
                nums[mid]=temp;
                left++;
                mid++;
                

            }else{

                //swap with right - do not INC mid as we are sorting from left to right
                int tempu=nums[right];
                nums[right]=nums[mid];
                nums[mid]=tempu;
                right--;
            }
        }



        
    }

    public static void main(String[] args) {

        int[] nums = {0,1,1,0,1,2,1,2,0,0,0};
        sortItNow(nums);
        for(int i: nums){
            System.out.println(i);
        }
        
    }
    
}
