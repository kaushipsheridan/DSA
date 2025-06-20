import java.util.HashMap;

public class subarraySumequalsK {

    public static int findIt(int[] nums, int k){

        //lets make a prefix sum array
        int[] prefix= new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
           prefix[i]= prefix[i-1]+nums[i];                                  
        }

        // now we want k = prefix[j]-prefix[i-1]
        //also, prefix[i-1] must be = p[j] -k

        //setting a Hashmap<PS,Freq> to store PS and its frequency
        //meanwhile also checking if that sum is present in the map by
        //calculating P(i-1)=P[j]-k - if it is present - count += frequency

        //count to keep track
        int count=0;

        //Key : Prefix's Value : their frequency
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int j=0;j<nums.length;j++){

            //if prefix of j itself is = k , inc count;
            if(prefix[j]==k){
                count++;
            }

            //if the key is already present in the map - inc count by freq.
            if((map.containsKey(prefix[j]-k))){
                count+=map.get(prefix[j]-k);
            }

            //adding the current prefix[j] to map
            if(!map.containsKey(prefix[j])){
                map.put(prefix[j], 1);
            }else{
                map.put(prefix[j],(map.get(prefix[j])+1));
                
            }
        }

         
        return count;
    }   

    public static void main(String[] args) {
        int[] arr = {9,4,0,20,3,10,5} ;
        int k=33;
        
        int rel =findIt(arr,k);
        System.out.println(rel);
    }
    
}
