package BinarySearch;

public class minDaystoMakeMBoquets {

    public static  int minDays(int[] bloomDay, int m, int k) {

        if(m*k>bloomDay.length){
            return -1;
        }

        //getting the min and max element
        int min= Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i: bloomDay){
            if(i>=max){
                max=i;
            }

            if(i<=min){
                min=i;
            }
        }

        //now our range of answers will be from min to max
        int left = min;
        int right= max;

        int answer=-1;

        while(left<=right){

            int mid = left + (right-left)/2;

            if(canMake(bloomDay, m, k, mid)){
                answer=mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }

        }
        
        return answer;
    }

    public static boolean canMake(int[] bloomDay, int m, int k, int day) {
        int bouquets = 0, flowers = 0;

        for (int i : bloomDay) {
            if (i <= day) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
        }

        return bouquets >= m;
    }



    public static void main(String[] args) {
        int[] nums = {7,7,7,7,13,11,12,7};
        int m =2;
        int k=3;
        System.out.println(minDays(nums, m, k));
    }
    
}
