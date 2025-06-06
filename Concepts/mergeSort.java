package Concepts;

//MERGE SORT - DIVIDE AND CONQUER

public class mergeSort {



    //DIVIDE - until every element in the array is a seperate array
    public static void merge(int[] arr,int start,int end){

        if(start<end){

            int mid= start + (end-start)/2;

            //left part
            merge(arr, start, mid);
            
            //right part 
            merge(arr,mid+1,end);

            //Now over to CONQUER - merge back in accending order
            mergeUp(arr,start,end,mid);
            
        }
        

    } 




    //CONQUER - combine 2 arrays in sorted order
    public static void mergeUp(int[] arr, int start,int end,int mid){

        //making a temp space - int array
        int[] temp = new int[arr.length];
        int i=start;
        int j=mid+1;

        //pointer for temp array
        int k =start;

            //Compares LEFT and RIGHT array iteratively and combines in sorted order
            while(i<=mid && j<=end){    
                if(arr[i]<arr[j]){
                    temp[k++]= arr[i];
                    i++;
                }else{
                    temp[k++]=arr[j];
                    j++;
                }

            }

        //If -> LEFT = 1,2,3 and RIGHT = 4,5,6 therefore only left will be passed and right will remain as it is, to solve this 
        //we have to push rest elements of RIGHT AND LEFT arrays

            //Pushing rest of LEFT array
            while(i<=mid){
                temp[k++]=arr[i++];
               
            }
            //Pushing rest of RIGHT array
            while(j<=end){
                temp[k++]=arr[j++];
            }

        
       //Now Copying all the Temp array values to Original array
       for(int x =start; x<=end;x++){
            arr[x]=temp[x];
       }    


    }

    public static void main(String[] args) {
        int[] arr = {6,3,8,7,1,9};
        merge(arr, 0, arr.length-1);
         for (int val : arr) {
            System.out.print(val + " ");
        }
    }
    
}
