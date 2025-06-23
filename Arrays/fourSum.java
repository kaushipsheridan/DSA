import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSum {

      public static List<List<Integer>> sortItOut(int[] nums, int target){

        //Will take nLogn TC
        Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){continue;};

            for(int j=i+1;i<nums.length;j++){
                if(j!=i+1 && nums[j]==nums[j+1]){continue;};

                int k=j+1;
                int l=nums.length-1;

                while(k<l){
                    //saving from crashing when inputting large values
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];

                    if(sum==target){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);

                        list.add(temp);

                        k++;l--;

                        //Move k & l until there is a new element
                        while(nums[k]==nums[k-1] && k<l){k++;};
                        while(nums[l]==nums[l+1] && l>k){l--;};
                        
                    }else if ( sum<target){
                        k++;
                    }else{
                        l--;

                    }
                }





            }
        }


        return list;
    }
    public static void main(String[] args) {
        
    }
}
