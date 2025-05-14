public class minMergingOperations {


    public static int minMerge(int[] arr){
        
        int ans=0;
        int j=arr.length-1;

        for(int i=0;i<=j;){

            //if first and last element are same, go to the next one!
            if(arr[i]==arr[j]){
                i++;
                j--;
            }
            //If - i > j -> we need to inc. j -> add j and j-1
            else if(arr[i]>=arr[j]){
                j--;
                arr[j]= arr[j] + arr[j+1];
                ans++;
            }
            //If - i < j -> we need to inc. i -> add i and i+1
            else{
                i++;
                arr[i]= arr[i]+ arr[i-1];
                ans++;
            }
        }
       
       
        return ans;
    }

    public static void main(String[] args) {

        int[] arr= {13,7,8,3,13};
        int result = minMerge(arr);
        System.out.println(result);
        
    }
    
}
