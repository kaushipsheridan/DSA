package BinarySearch;

public class shipWithinDays {

    public static int shipWithinDaysNow(int[] weights, int days) {
        int[] rel = returnSumAndMax(weights);
        int left = rel[1];
        int right= rel[0];

        int minWeight=Integer.MAX_VALUE;

        while(left<=right){
            int mid = left+ (right-left)/2;

            if(checkIt(weights, days, mid)){
                minWeight= Math.min(minWeight, mid);
                right = mid -1;
            }else{
                left = mid +1;
            }

        }

        return minWeight;
    }

    public static boolean checkIt(int[] nums, int days, int limit){
        
         int daysUsed = 1;
         int currentLoad = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > limit) {
                return false; // Package too heavy to ever fit
            }

            if (currentLoad + nums[i] <= limit) {
                currentLoad += nums[i];
            } else {
                daysUsed++;
                currentLoad = nums[i];
            }

            if (daysUsed > days) {
                return false;
            }
        }

        return true;

    }

    public static int[] returnSumAndMax(int[] weights){
         
        int sum =0;
        int maxNum=Integer.MIN_VALUE;
        for(int i: weights){
            sum+=i;
            if(i>maxNum){
                maxNum=i;
            }
        }
        
          return new int[]{sum, maxNum};
    }

    public static void main(String[] args) {

        int[] main = {3,2,2,4,1,4};
        int days =3;
         
        System.out.println(shipWithinDaysNow(main,days));
        
    }
    
}
