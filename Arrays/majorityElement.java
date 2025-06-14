public class majorityElement {

    public static int findMax(int[] nums){


        //Boyer - Moore Alogo T.C. - O(n) and S.C. is O(1)

        int cand=-1;
        int count=0;

        for(int i : nums){
            if(count==0){
                cand=i;
                count++;
            }else if(i==cand){
                count++;
            }else if(i!=cand && count!=0){
                count--;
            }
        }


        return cand;
    }

    public static void main(String[] args) {
        int[] nums = {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
        int result = findMax(nums);
        System.out.println(result);
        
    }
    
}
