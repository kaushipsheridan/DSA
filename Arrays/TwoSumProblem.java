import java.util.HashMap;

public class TwoSumProblem {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();

        int [] rel = new int[2];

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                rel[0]=map.get(nums[i]);
                rel[1]=i;
            }else{
                map.put(target-nums[i], i);
            }
        }

        return rel;

        
        
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target =9;

        int[] result = twoSum(nums,target);

        for(int i: result){
            System.out.println(i);
        }


    }
    
}
