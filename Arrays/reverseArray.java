public class reverseArray {

    // NOTE : Good time complexity : O(n) where n is the length of the array

    // public static int[] reverseIT(int[] arr){
    //     int arraylength = arr.length;
    //     int[] revarray = new int[arraylength];
    //     int start =0;

    //     for(int i= (arraylength -1); i>=0 ; i--){
    //        if(start<arraylength){
    //         revarray[start]= arr[i];
    //         start ++;
    //        }
    //     }
    //     return revarray;
    // }




    

    //NOTE : For better time complexity : O(1) reversing the same array instead of creating 
    //       a new one and then putting the elements 

    public static int[] reverseIT(int[] arr){

        int left=0;
        int right=arr.length-1;

        while(left<right){
            int temp = arr[right];
            arr[right]= arr[left];
            arr[left]=temp;

            left++;
            right--;
        }

        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] revarr = reverseIT(arr);
        for(int i : revarr){
            System.out.println(i);
        }
        
    }
    
}
