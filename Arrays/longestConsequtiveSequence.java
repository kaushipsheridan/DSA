import java.util.HashMap;
import java.util.HashSet;

public class longestConsequtiveSequence {

    public static int Longest(int[] nums){
        
        HashSet<Integer> set = new HashSet<>();

        //adding the num to hashset
        for(int i : nums){
            set.add(i);
        }   

        
        int maxc=0;

        //scrolling through the set
        for(int j : set){

            //if set contains: j-1 -> means its j is not the first element of the sequence 
            if(!set.contains(j-1)){
                //if we are here, it means j is the first element of the possible sequence -> go till the end;
                 int test=j;
                 int count=1;

                while(set.contains(test+1)){
                    test++;    
                    count++;
                }

                maxc=Math.max(count, maxc);

            }
            
        }

        return maxc;

    }
    public static void main(String[] args) {

        int[] nums= {102,4,100,1,101,3,2,1,1};
        int rel=Longest(nums);
        System.out.println(rel);
        
    }
    
}
