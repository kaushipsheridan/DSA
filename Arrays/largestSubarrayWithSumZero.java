import java.util.HashMap;

public class largestSubarrayWithSumZero {

    // //Brute Force -> O(nSq)          SC is O(1)
    // public static int solve(int[] nums){
    //     int max=0;
    //     for(int i=0;i<nums.length;i++){
    //         //intialise sum as zero
    //         int sum=0;
    //         for(int j=i;j<nums.length;j++){
    //             sum+=nums[j];
    //             if(sum==0){
    //                 max=Math.max(max, (j-i+1));
    //             }
    //         }   
    //     }
    //     return max;
    // }

    //Better/Optimised Solution - TC : O(n)     SC : O(n)
    public static int solve(int[] nums){
        
        //Key : current sum(if not present in hashmap already)
        //Value : Index of the current element
        HashMap<Integer,Integer> map = new HashMap<>();

        int sum=0;
        int max=0;

        for(int i=0;i<nums.length;i++){ 

            sum+=nums[i];

            if(sum==0){
                max=Math.max(max, i+1);
            }else if(!map.containsKey(sum)){
                map.put(sum,i);
            }else{
                max=Math.max(max,  (i-map.get(sum))  );
            }


        }

        return max;

    }


    public static void main(String[] args) {
        int a[] = {9, -3, 3, -1, 6, -5};
        System.out.println(solve(a));
    }
    
}
