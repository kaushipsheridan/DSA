public class countInversions {

    //DIVIDE- Changed return type to int cause total insversions will be leftCount+rightCount+inversionCount;
    public static int mergeSort(int[] arr, int start, int end){

        if(start<end){
            int mid = start + (end-start)/2;

            int leftInversion = mergeSort(arr, start, mid);
            int rightInversion = mergeSort(arr,mid+1,end);

            int invCount= merge(arr, start,mid, end);

            return leftInversion + rightInversion + invCount;

        }


        return 0;
    }


    //CONQUER
    public static int merge(int[] arr, int start,int mid,int end){
        

        int[] temp = new int[end-start+1];
        int i=start;
        int j=mid+1;

        //variable for inversion count 
        int inversionC=0;

        //pointer for temp array
        int k=0;

        while(i<=mid && j<=end){

            if(arr[i]<=arr[j]){
                temp[k++]=arr[i];
                i++;
            }else{
                temp[k++]=arr[j];
                j++;
                //Counting all possible inversions together
                inversionC+=(mid-i+1);            }
        }

        //putting remaining i elements
        while(i<=mid){
            temp[k++]=arr[i];
            i++;
        }

        //pushing all remaining j elements
        while(j<=end){
            temp[k++]=arr[j];
            j++;
        }

        //copying all the temp to arr
        for(int x=0;x<temp.length;x++){

            arr[start+x]=temp[x];
        }

        return inversionC;

    }

    public static void main(String[] args) {
        int[] arr = {6,3,5,2,7};

        int ans=mergeSort(arr, 0, arr.length-1);
        System.out.println(ans);

    }
    
}
