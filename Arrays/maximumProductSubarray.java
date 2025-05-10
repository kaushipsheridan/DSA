public class maximumProductSubarray {

    public static int maxProduct(int[] nums){
        
        //BRUTE FORCE - NESTED FOR LOOP

        //BETTER SOLUTION - 
        int prodfromleft=1;
        int prodfromright=1;
        int max=nums[0];
        int n= nums.length;

        for(int i=0;i<nums.length;i++){

            if(prodfromleft==0){
                prodfromleft=1;
            }

            if(prodfromright==0){
                prodfromright=1;

            }

            prodfromleft*=nums[i];
            prodfromright*=nums[n-1-i];

            max=Math.max(max,Math.max(prodfromleft, prodfromright));

        }

        return max;
    }
    public static void main(String[] args) {
        int[] nums = {-3,0,1,-2};
       System.out.println(maxProduct(nums));
    }
}
