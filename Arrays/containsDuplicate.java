import java.util.HashSet;

public class containsDuplicate {

    //This Solution is Good - But can be improved as we dont need to put the entire array into set
    
    // public static boolean containsDupe(int[] nums) {
    //     HashSet set = new HashSet<>();
    //     for (int num : nums){
    //         set.add(num);
    //     }
    //    return nums.length != set.size();
    // }


    //This solution is Better - As it figures out if duplicates are present without adding the the entire array into the set

    public static boolean containsDupe(int[] nums){
        HashSet set = new HashSet<>();
        for(int n : nums){
            if(!set.add(n)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4};
        boolean check = containsDupe(arr);
        System.out.println(check);
    }
}
