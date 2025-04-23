//TIME COMPLEXITY - O(n) = O(1)

public class maxSubArray {

    public static int maxSubArray(int[] nums) {

        //final max sum
        int maxsum=Integer.MIN_VALUE;
        //current max sum
        int currentsum=0;

        for(int i : nums){

            //put the value of ith index in currrentsum
            currentsum+=i;

            //now comparing which one is better to be in max sum
            maxsum = Math.max(maxsum, currentsum);

            //if current sum is a negative value, no need to carry it,
            //therefore make it zero
            if(currentsum<0){
                currentsum=0;
            }
            
        }

        //finally return the maxfum

        return maxsum;
        
    }
    public static void main(String[] args) {

        int[] nums = {5,-1,3,-3,4,-1,2,1,-5,4};
       System.out.println(maxSubArray(nums));

        
    }
}
