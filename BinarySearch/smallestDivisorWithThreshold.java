package BinarySearch;

public class smallestDivisorWithThreshold {


    public static int smallestDivisor(int[] nums, int threshold) {
        
        //finding the min and max index first
        int max = Integer.MIN_VALUE;

        for(int i : nums){

            if( i>max){
                max=i;
            }
        }

        //now that we have max and min;

        int left=1;
        int right =max;
        int answer=0;

        while(left<=right){
            int mid = left + (right-left)/2;

            if(findDivisorSum(nums, mid,threshold)){
                answer=mid;
                right = mid-1;
            }else{
                left = mid +1;
            }


        }

        return left;
    }

    public static boolean findDivisorSum(int[] nums, int mid, int threshold){

        int divsum =0;

        for(int i : nums){
            divsum += (int)Math.ceil((double)i/mid);
        }


        return divsum<=threshold;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,5,9};
        int thres=6;

        System.out.println(smallestDivisor(nums, thres));
    }
    
}
