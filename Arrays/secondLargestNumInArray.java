import java.util.HashMap;

public class secondLargestNumInArray {


    public static int secondLargest(int[] arr){
        
        int largest=-1;
        int secondLargest=-1;

        for(int i=0;i<arr.length;i++){

            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }else if(arr[i]>secondLargest && arr[i]<largest){
                secondLargest=arr[i];
            }
        }

        return secondLargest;
    }
    public static void main(String[] args) {
        int[] arr = {8,8,7,6,5};
        int rel = secondLargest(arr);
        System.out.println(rel);
    }
}
