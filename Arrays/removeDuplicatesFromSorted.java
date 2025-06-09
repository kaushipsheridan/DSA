import java.util.ArrayList;
import java.util.HashSet;

public class removeDuplicatesFromSorted {

    //TC and SC is O(n) but we can do better

    // public static int removeIt(int[] nums){

    //     if(nums.length==0){return 0;}
    //     HashSet set= new HashSet<>();
    //     int arrindex=0;
    //     int count=0;
    //     for(int i=0;i<nums.length;i++){
    //         if(set.add(nums[i])){ 
    //             count++; 
    //             nums[arrindex]=nums[i];
    //             arrindex++; 
    //         }
    //     }
    //     return count;
    // }

    //TC is O(n) and SC is O(1)
    public static int removeIt(int[] nums){

    if(nums.length==0){return 0;}
    int i=1;
    for(int j=1;j<nums.length;j++){
        if(nums[j]!=nums[i-1]){
            nums[i]=nums[j];
            i++;
        }    
        
    }
    
    return i;
    }
    
    public static void main(String[] args) {
        int[] nums = {1,1,2,2};
        int rel= removeIt(nums);
        System.out.println(rel);

        System.out.println("------");

        for(int hehe: nums){
            System.out.println(hehe);
        }
    }
    
}
