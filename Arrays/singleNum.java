public class singleNum {

    public static int checkItout(int[] nums){

        int result=0;

        //Concept of XOR, check in notes
        for(int i:nums){
            result = result^i;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums= {4,1,2,1,2};
        int rel= checkItout(nums);
        System.out.println(rel);

    }
    
}
