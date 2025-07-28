package BinarySearch;

public class kthElementin2SortedArray {

    public static int findKElement(int[] arr1, int[] arr2, int k){

        //checking which one is smaller
        int n1=arr1.length;
        int n2=arr2.length;

        //if n2 is smaller, we gotta switch nums1 and nums2 to reduce TC to as least as possible
        if(n1>n2){
           return findKElement(arr2, arr1,k);
        }

        //GETTING TOTAL N
        int totaln = arr1.length+arr2.length;

        return findKNow(arr1,arr2,n1,n2,k); 

    }

    public static int findKNow(int[] arr1, int[] arr2, int n1, int n2, int k){

        int left = 0;
        int right= arr1.length;

        while(left<=right){
            int mid = left + (right-left)/2;

            int mid1 = mid;
            int mid2= k-mid1;

            //setting initial values
            int l1= Integer.MIN_VALUE;
            int l2=Integer.MIN_VALUE;
            int r1=Integer.MAX_VALUE;
            int r2=Integer.MAX_VALUE;

            //setting actual values to 
            if(mid1<n1) r1=arr1[mid1];
            if(mid2<n2) r2=arr2[mid2];
            if(mid1-1 >= 0) l1= arr1[mid1-1];
            if(mid2-1 >= 0) l2= arr2[mid2-1];

             //checking perfect spot
            if(l1<=r2 && l2<=r1){
                return Math.max(l1, l2);
            }else if (l1>r2){
                //eliminate right, move left
                right = mid-1;
            }else{
                //eliminate left, move right
                left= mid+1;
            }



        }


        throw new IllegalArgumentException("EHHE");
        
    }

    public static void main(String[] args) {
        int[] arr1= {1, 2, 3, 5, 6};
        int[] arr2= {4, 7, 8, 9, 100};

        int k =7;

        System.out.println(findKElement(arr1,arr2,k));
    }
}
