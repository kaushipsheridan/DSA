package BinarySearch;

public class nthRootOfNumberUsingBS {

    //better approach -
    public static int findRoot(int m, int n){

        int left =0;
        int right =m;

        while(left<=right){

            int mid = left + (right-left)/2;

            int temp = n;
            
            int ans=1;

            //checking if mid is root
            while(temp>0){
                ans*=mid;
                temp--;
            }

            // regular BS 
            if(ans==m){
                return mid;
            }else if (ans < m ){
                left = mid+1;
            }else{
                right = mid-1;
            }

            

        }

        return -1;
    }

    public static void main(String[] args) {
        
        int m=27;

        int n=3;

        int rel = findRoot(m,n);
        
        System.out.println(rel);

    }
    
}
