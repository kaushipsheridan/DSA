package BinarySearch;

public class kokoEatingBanana {

    public static  int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Integer.MIN_VALUE;

        //finding max element in array
        for(int i: piles){
            if(i>=r){
                r=i;
            }
        }

        int totalhours;

        //now using BS to find the min possible number 
        while(l<=r){

            int mid = l + (r-l)/2;

            totalhours= fxnTotal(piles,mid);

            if(totalhours<=h){
                //therfore we gotta reduce banana per hours
                r = mid-1;
            }else{  
                //else we have to increase banana per hour speed
                l = mid +1;
            }

        }

        //at the end, l will point to the least possible banana eating speed
        return l;
    }

    public static int fxnTotal(int[] piles, int hourly){

        int totalhours=0;

        for(int i : piles){
            totalhours+=Math.ceil((double)i/hourly);
        }

        return totalhours;
    }

    public static void main(String[] args) {
         int[] nums = {30,11,23,4,20};
         int h=5;
         System.out.println(minEatingSpeed(nums,h));
    }


   
    
}
