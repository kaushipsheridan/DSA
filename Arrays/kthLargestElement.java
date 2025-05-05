public class kthLargestElement {

    public static int kthLargestElementFind(int[] arr, int k){

        int n = arr.length;
        int maxNum= Integer.MIN_VALUE;
        int maxNumIndex=0;
        for(int i=0; i<n;i++){

            if(arr[i]>maxNum){
                maxNum=arr[i]; 
                maxNumIndex=i;
            }

        }

        int answer = arr[maxNumIndex ];

        return 0;
    }   

    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,4};
        int k= 2;

        int result = kthLargestElementFind(arr, k);

        System.out.println(result);
    }
    
}
