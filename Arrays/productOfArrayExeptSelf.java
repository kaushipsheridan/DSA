public class productOfArrayExeptSelf {

    //BRUTE FORCE must be nested for loops 


    //Better Approach - multiply every element and divide by i (handle division by 0 too)


    // //Optimal approach - O(n) time and space complexity
    // public static int[] productExceptSelf(int[] arr){

    //     int[] result = new int[arr.length];


    //     //calculating prefix and storing in array- product of numbers from 1 to i

    //     int[] prefix = new int[arr.length];
    //     prefix[0] = 1;

    //     for(int i=1;i<arr.length;i++){
    //         prefix[i]= prefix[i-1] * arr[i-1];
    //     }
    

    //     //calculating suffix and storing in array- product of numbers from i to arr.length

    //     int[] suffix = new int[arr.length];
    //     suffix[arr.length-1]=1;

    //     for(int j=arr.length-2;j>=0;j--){
    //         suffix[j] = suffix[j+1] * arr[j+1];
    //     }

        
    //     //now we know that every i in result can be calculated by multplying prefix[i] and suffix[i]
    //     for(int k = 0; k < arr.length;k++){

    //         result[k]= prefix[k] * suffix[k];

    //     }

    //     return result; 
    // }







    //Best approach - O(n) time complexity and O(1) space complexity
    public static int[] productExceptSelf(int[] arr){

        int[] result = new int[arr.length];

        //calculating prefix and storing in array- product of numbers from 1 to i
        result[0]=1;
        for(int i=1;i<arr.length;i++){
            result[i]= result[i-1] * arr[i-1] ;
        }

        //calculating suffix and storing in array- product of numbers from i to arr.length
        int suffix= 1;
        for(int j=arr.length-2;j>=0;j--){
            //getting updated suffix everytime
           suffix *= arr[j+1];
           //updating result directly
           result[j]*= suffix;
        }

        return result; 
    }

    public static void main(String[] args) {

        int[] arr = {-1,1,0,-3,3};
        int [] newarr = productExceptSelf(arr);

        for(int i: newarr){
            System.out.println(i);
        }
       
        
    }
    
}
