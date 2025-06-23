import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class majorityElementnby3 {

    //BRUTE FORCE : TC(On) and SC(On)

    // public static List<Integer> majorityElementFinder(int[] nums){
    //     ArrayList<Integer> list = new ArrayList<>();
    //     HashMap<Integer,Integer> map = new HashMap<>();

    //     //key is the element and value is its frequency

    //     for(int i: nums){
    //         if(map.containsKey(i)){
    //             map.put(i, map.get(i) +1);
    //         }else{
    //             map.put(i,1);
    //         }
    //     }

    //     int criteria=nums.length/3;
    //     //checking which element is passing the criteria
    //     for(int j: nums){
    //         if(map.get(j) > criteria  && (!list.contains(j))){
    //             list.add(j);
    //         }else{
    //             continue;
    //         }   
    //     }

    //     //printing the list
    //     for(int k: list){
    //         System.out.println(k);
    //     }

    //     return list;
    // }



    //Optimal Solution _ BOYER MOORE Majority Element - TC: O(n) and SC O(1)
    //since ONLY 2 ELEMENTS can be >n/3, we will try to find 2 elements simultaneously

    public static List<Integer> majorityElementFinder(int[] nums){

        //Pass 1 : Finding 2 possible maximum freq integers
        Integer cand1=null;
        int count1=0;

        Integer cand2=null;
        int count2=0;   

        for(int i : nums){
            if(cand1!=null && i==cand1){count1++;}
            else if(cand2!=null && i==cand2) {count2++;}
            else if (count1==0){cand1=i; count1++;}
            else if (count2==0){cand2=i;count2++;}
            else{count1--;count2--;}
        }   


        //Pass 2 - Verifying which one of 2 is the answer
        
        ArrayList<Integer> list = new ArrayList<>();

        count1=0;
        count2=0;

        for(int j : nums){
            if(j==cand1){
                count1++;
            }else if(j==cand2){
                count2++;
            }
        }

        int criteria=nums.length/3;
        if(count1>criteria){list.add(cand1);}
        if(count2>criteria){list.add(cand2);}


        return list;
        
    }

    public static void main(String[] args) {
        int [] arr = {3,2,3,1,9,3,7,3,5,3};
        majorityElementFinder(arr);



    }
    
}
