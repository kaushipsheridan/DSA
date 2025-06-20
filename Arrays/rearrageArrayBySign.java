public class rearrageArrayBySign {

    public static int[] arrange(int[] nums){

        int[] newnum= new int[nums.length];

        int posIndex=0;
        int negIndex=1;

        for(int j : nums){

            if(j>=0){
                newnum[posIndex]=j;
                posIndex+=2;
            }else{
                newnum[negIndex]=j;
                negIndex+=2;
            }
        }


        return newnum;
    } 
    public static void main(String[] args) {
        int[] arr= {3,1,-2,-5,2,-4};
        int[] newarr=arrange(arr);

        for(int i: newarr){
            System.out.println(i);
        }
    }
    
}
