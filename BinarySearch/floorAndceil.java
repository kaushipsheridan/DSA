package BinarySearch;

public class floorAndceil {

    public static int[] findIt(int[] nums, int target){

        int l1=0;
        int r1=nums.length-1;

        int l2=0;
        int r2=nums.length-1;

        int ceiling = -1;
        int floor = -1;

        int[] rel = new int[2];
        
        
        //Floor 
        while(l1<=r1){
            
            int mid = l1 + (r1-l1)/2;

            if(nums[mid]==target){
                floor = nums[mid];
                break;
            }else if (nums[mid]<=target) {
                floor=nums[mid];
                l1 = mid+1;
            }else{
                r1=mid-1;
            }

        }

        //Ceil 
        while(l2<=r2){

            int mid = l2 + (r2-l2)/2;

            if(nums[mid]==target){
                ceiling=nums[mid];
                break;
            }else if (nums[mid]<=target) {
                l2 = mid+1;
            }else{
                ceiling=nums[mid];
                r2=mid-1;
            }

        }

        //putitng values to array
        rel[0]=floor;
        rel[1]=ceiling;
               
        return rel ;
    }
    public static void main(String[] args) {
        int[] nums = {3, 4, 4, 5, 7, 8, 10};
        int target = 5;

        for( int i : findIt(nums, target)){
            System.out.println(i);
        }

    }
    
}
