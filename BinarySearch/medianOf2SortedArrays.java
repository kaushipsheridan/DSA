package BinarySearch;

//MOST OPTIMAL APPROACH
public class medianOf2SortedArrays {

    public static double findMedian(int[] nums1, int[] nums2){

        //checking which one is smaller
        int n1=nums1.length;
        int n2=nums2.length;

        //if n2 is smaller, we gotta switch nums1 and nums2 to reduce TC to as least as possible
        if(n1>n2){
           return findMedian(nums2, nums1);
        }

        //GETTING TOTAL N
        int totaln = nums1.length+nums2.length;

        return findMedianBS(nums1,nums2,n1,n2);
        
    }

    public static double findMedianBS(int[] nums1, int[] nums2, int n1, int n2){

        int left=0;
        int right=nums1.length;
        boolean isEven=false;

        if(((n1+n2) %2) ==0){isEven=true;}

        while(left<=right){

            int mid = left + (right-left)/2;
            int mid1 = mid;
            //as by default java takes floor as result!!!
            int mid2 = (n1 + n2 + 1) / 2 - mid1;

            //setting initial values
            int l1= Integer.MIN_VALUE;
            int l2=Integer.MIN_VALUE;
            int r1=Integer.MAX_VALUE;
            int r2=Integer.MAX_VALUE;

            //setting actual values to 
            if(mid1<n1) r1=nums1[mid1];
            if(mid2<n2) r2=nums2[mid2];
            if(mid1-1 >= 0) l1= nums1[mid1-1];
            if(mid2-1 >= 0) l2= nums2[mid2-1];

            //checking perfect spot
            if(l1<=r2 && l2<=r1){

                //RETURNING BASED OF N BEING ODD OR EVEN
                if (isEven) {
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                } else {
                    return Math.max(l1, l2);
                }
            }
            //now elimination
            else if(l1>r2){
                //eliminate right, move left
                right = mid-1;
            }else {
                //eliminate left, move right
                left=mid+1;
            }

        }

        // Should never reach here with valid input
        throw new IllegalArgumentException("Invalid input arrays");

    }

    public static void main(String[] args) {
        int[] arr1= {1,3,5,7,9};
        int[] arr2= {6,8,10,12,13};

        System.out.println(findMedian(arr1,arr2));
    }
    
}
