public class rotateArrayByK {

    //BRUTE FORCE - TC: ; SC:
    //Store the first k elements in another array and then left move other elements by k, then place the stored array into the last k spaces
    //Will not code it 
    // public static void rotateIt(int[] nums , int k)// }


    public static void revereFXN(int[] arr, int start, int end){

        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;end--;
        }
    }

    //Optimised Approach - TC: o(2n) SC is O(1) since no extra space will be used 
    public static void rotateIt(int[] nums, int k){

        int d = nums.length-k;

        //REVERSING PART A
        revereFXN(nums, 0, d-1);
        //REVERSING PART B
        revereFXN(nums, d, nums.length-1);

        //REVERSING ENTIRE ARRAY
        revereFXN(nums, 0, nums.length-1);

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotateIt(arr,3);

        for(int i: arr){
            System.out.println(i);
        }
    }
    
}
