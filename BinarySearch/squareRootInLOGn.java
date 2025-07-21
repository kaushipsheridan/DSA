package BinarySearch;

public class squareRootInLOGn {


    //Brute Force
    // loop 1-n -> sq every time, as soon as it reaches > given num -> return the previous num

    //Optimal approach
    //TC is O(log N) and SC is O(1)
    public static int findSqRoot(int n){

        int left =0;
        int right=n;
        int mid =0;

        while(left<=right){

            mid = left + (right-left)/2;

            if(mid*mid <= n){

                if(mid*mid==n){
                    return mid;
                }

                //checking mid+1'st element's square
                if((mid+1)*(mid+1)<=n){
                    left=mid;
                }else{
                    return mid;
                }
                
            }else{
                right=mid;
            }
        }
        return mid;
    }
    public static void main(String[] args) {
        
        int n = 49;
        System.out.println(findSqRoot(n));
        
    }
}
