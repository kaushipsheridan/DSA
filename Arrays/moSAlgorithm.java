public class moSAlgorithm {

    public static int moAlgo(int[] arr , int[] query){

        
        int l=query[0];
        int r=query[1];

        //lets take out the sq root first
        int sqrt= (int) Math.sqrt(arr.length);  
        
        //setting block ID and Block array
        int block_id=-1;
        int[] block= new int[sqrt+1];


        //first lets fill the block up
        for(int i=0;i<arr.length;i++){
                if(i%sqrt==0){
                    block_id++;
                }
                
                 block[block_id]+= arr[i];
                
        }

        // Now we hanlde the sum of numbers at index a->b

        int answer=0;

        //handling the LEFT PORTION of the block/s
        while(l<r &&  l%sqrt!=0 && l!=0 ){
            answer+=arr[l];;
            l++;
        }

        System.out.println(answer);

        //handling the BLOCK
        while(l+sqrt<=r){
            answer+=block[l/sqrt];
            l+=sqrt;

        }

                System.out.println(answer);


        //handling the RIGHT PORTION of the block/s

        while(l<=r){
            answer+=arr[l];
            l++;
        }

                System.out.println(answer);


        return answer;
    }


    public static void main(String[] args) {

        int arr[] = {1, 1, 2, 1, 3, 4, 4, 2, 8} ;
        int query[] = {1,6};

        System.out.println(moAlgo(arr, query));

        
    }
}
