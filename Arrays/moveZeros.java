public class moveZeros {

    //TC is o(n) and SC is o(1)
    public static void moveIt(int[] nums){

        if(nums.length==1 &&  nums[0]==0){
            return;
        }


        int i=0;

        for(int j=1;j<nums.length;){

            //if first num is non zero, we skip ( i must be zero, until then we skip)
            if(nums[i]!=0){i++;j++;continue;}

            //j must be non zero, until then j++
            else if(nums[j]==0){j++; continue;}

            else if( nums[i]==0 && nums[j]!=0){
                //then we swap
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;

                i++;j++;
            }



        }

    }
    public static void main(String[] args) {

        int[] nums = {0,1,0,0,0,3,12};
        moveIt(nums);

        for(int i: nums){
            System.out.println(i);
        }
        
    }
    
}
