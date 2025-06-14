public class maxSubarrayPrintAll {

    public static int MaxSubPrint(int[] nums){

        int csum=0;
        int msum=0;
        int tempstart=0;
        int start=0;
        int end=0;

        for(int i=0;i<nums.length;i++){

            if(csum<0){
                csum=nums[i];
                tempstart=i;
            }else{
                csum+=nums[i];
            }

            if(csum>msum){
                msum=csum;
                start=tempstart;
                end=i;
            }

        }

        //PRINTING MAX SUBARRAY
        for(int j=start;j<=end;j++){
            System.out.println(nums[j] + ",");
        }

        return msum;



    }

    public static void main(String[] args) {
        int[] nums= {-2,-3,4,-1,-2,1,5,-3};
        int maxsum= MaxSubPrint(nums);

        System.out.println("Max Sum = " + maxsum);

    }
    
}
