import java.util.Arrays;

public class mergeSortedArray {

    public static void merge(int[] arr1, int[] arr2, int m, int n){

        int i=arr1.length-1;
        int j=0;


        while(i>=0 && j<=n){
            if(arr1[i] >arr2[j]){

                //Swap
                int temp=arr1[i];
                arr1[i]=arr2[j];
                arr2[j]=temp;

                i--;j++;

            }else{
                break;
            }
        }
        //SORTTING ARR 1 AND ARR 2
        Arrays.sort(arr1);
        Arrays.sort(arr2);


    }

    public static void main(String[] args) {

        int[] arr1 = {1, 4, 8, 10};
        int[] arr2 = {2, 3, 9};
        int n = 4, m = 3;
        merge(arr1, arr2, n, m);
        System.out.println("The merged arrays are:");
        System.out.print("arr1[] = ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.print("\narr2[] = ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        
    }
    
}
