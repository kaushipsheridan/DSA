public class minInRotataedSortedArray {

    // Brute Force Approach - Arrays.sort and return 1st element - O(nlogn)


    // Better Approach - Time Complexity - O(n)

    // public static int findmin(int[] nums){

    //     int min= Integer.MAX_VALUE;

    //     for(int i : nums){
    //         if(i<min){
    //             min=i;
    //         }
    //     }

    //     return min;
    // }

    

    // Optimal approach - Bubble sort in the sorted half - Time Complexity - O(log n)
    public static int findmin(int[] nums){

    int left = 0;
    int right= nums.length -1;



        while(left<right){

            //Gets us mid point
            int mid = left + (right-left)/2;


            if(nums[mid]<= nums[right]){
                right = mid;
            }else{
                left = mid +1;
            }
        }    
    
        return nums[left];
    }
    public static void main(String[] args) {

        int[] nums = {11,13,15,17};
        int sol = findmin(nums);
        System.out.println(sol);
        
    }
    
}
