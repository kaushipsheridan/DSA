public class reversePars {

    public static int reverePairs(int[] nums){

        int start=0;
        int end = nums.length-1;
        int answer = mergeSort(nums, start, end);

        return answer;
        
    }
    //DIVIDE- Changed return type to int cause total insversions will be leftCount+rightCount+inversionCount;
    public static int mergeSort(int[] arr, int start, int end){
        

        if(start<end){

            int mid = start + (end-start)/2;
            //left side array's
            int leftCount =  mergeSort(arr, start, mid);
            //right side array's
            int rightCount = mergeSort(arr,mid+1,end);

            //main counting function 
            int count = countIt(arr,start,mid,end) + leftCount+rightCount;

            //merge function
            merge(arr, start,mid, end);

            return count;

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

    //function to count pairs - Given 2 sorted arrays 
    public static int countIt(int[]arr, int start, int mid, int end){
        
        int right=mid+1;
        int cnt =0;

        for(int i=start;i<=mid;i++){
            //inc right up until its possible
            
            //THis will cause INTEGER OVERFLOW ( in some cases) , instead use the next one 
            // while(right<=end && arr[i]> 2 * arr[right]){
            //     right++;
            // }

            while (right <= end && (long) arr[i] > 2L * (long) arr[right]){right++;}

            //If its at the edge, increase counter
            cnt += (right-(mid+1));
        }
        return cnt;
        
    }

    public static void main(String[] args) {
        int[] arr = {2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};

        int ans=reverePairs(arr);
        System.out.println(ans);

    }
    
}
