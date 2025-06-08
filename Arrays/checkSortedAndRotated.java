public class checkSortedAndRotated {

    public static boolean checkIt(int[] arr){

        int times=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > arr[(i+1)%arr.length] && ++times>1){
                return false;
            }
        }

        return times<=1;    
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        boolean rel = checkIt(arr);
        System.out.println(rel);
    }
    
}
