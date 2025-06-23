import java.util.*;

public class threeSum {

    public static List<List<Integer>> sortItOut(int[] nums){

        //Will take nLogn TC
        Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList<>();

        for(int i=0;i<nums.length;i++){

            //Move i until there is a new element
            if(i>0 && nums[i]==nums[i-1] ){continue;}

            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];

                if(sum<0){
                    j++;
                }else if (sum>0){
                    k--;
                }else{  
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);

                    //now that temp is ready, put it in the main list
                    list.add(temp);

                    j++;k--;

                    //Move j & k until there is a new element
                    while(nums[j]==nums[j-1] && j<k){j++;};
                    while(nums[k]==nums[k+1] && k>j){k--;};
                }   
            }


        }


        return list;
    }
    public static void main(String[] args) {
        
    }
    
}
