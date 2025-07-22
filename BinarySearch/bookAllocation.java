package BinarySearch;

public class bookAllocation {

    public static int allocateBooks(int[] nums, int k){

        //if number of students are more than number of books - bye bye return -1;
        if (k > nums.length) return -1;

        //if n ==m - each student will be assined one book and the max page book will be the ans 
        if(nums.length==k){
            
            //find out the max num
            int maxmax = Integer.MIN_VALUE;
            for(int i : nums){
                if(maxmax<i){
                    maxmax=i;
                }
            }

            return maxmax;
        
        }    

        //min pages that can be allocated - 0;
        //max pages that can be allocated is sum of arr

        //getting sum and max value 
        int sumarr=0;
        int maxmax = Integer.MIN_VALUE;

        for(int i : nums){
            sumarr+=i;

            if( i>maxmax){
                maxmax=i;
            }
        }   
        
        int left =0;
        int right =sumarr;

        


        int ans=0;

        while(left<=right){
            int mid = left + (right-left)/2;    

            if(isValid(nums,mid,k)){
                ans = mid;
                right = mid -1;
            }else{
                left = mid +1;
            }
        }

        return ans;
    }

    public static boolean isValid(int[] arr , int mid , int students ){

        int tempstu=1;
        int maxallocate=mid;
        int pages=0;

        for( int i=0; i<arr.length;i++){
            
            if(pages + arr[i]<=maxallocate){
                pages += arr[i];
            }else{
                tempstu++;
                pages=arr[i];
            }

        }

        return (tempstu<=students);

    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 90};
        int m=2;
        System.out.println(allocateBooks(arr,m));
    }
    
}
