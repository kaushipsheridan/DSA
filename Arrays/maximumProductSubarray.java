public class maximumProductSubarray {

    public static int maxProduct(int[] nums){
        
        //BRUTE FORCE - NESTED FOR LOOP

        //BETTER SOLUTION - 

        //handle exceptions such as (0,5);
        int test=0;
        for(int i: nums){
            test = Math.max(i, test);
        }

        int maxp=Integer.MIN_VALUE;
        int minp=Integer.MAX_VALUE;    
        int currentp=1;

        for(int i =0;i<nums.length;i++){

            currentp *= nums[i];

            maxp = Math.max(maxp, currentp);

            if(currentp<0){
                currentp=0;
            }
        }
        
        return maxp;


    }
    public static void main(String[] args) {
        int[] nums = {-2,0,-1};
       System.out.println(maxProduct(nums));
    }
}
