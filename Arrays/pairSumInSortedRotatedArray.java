public class pairSumInSortedRotatedArray {

    public static boolean findpair(int[] nums, int target){
        
        int right=0;
        //getting index of the largest element;
        for (int i = 0; i < nums.length - 1; i++) {
        if (nums[i] > nums[i + 1]) {
            right = i;
            break;
        }
}

        //getting index of the smallest element;
        int left= (right + 1) % nums.length;

        for(int j=nums.length-1;j>=0;j--){
            if(nums[j]<nums[j-1]){
                left=j-1;
                break;
            }
        }

        while(left!=right){

            int currentSum = nums[left] + nums[right];
            if(currentSum==target){
                return true;
            }
            else if (currentSum < target){

                // moving left means going forward in circular array ( increasing the smallest num)
                left = (left+1) % nums.length;
            }else{

                //moving right means going backward in the circular array ( decreasing the largest num)
                right = (right+nums.length-1) % nums.length;
            }

        }


        return false;
    }

    public static void main(String[] args) {

        int[] nums = {11, 15, 6, 8, 9, 10};
        int target=16;
        boolean result = findpair(nums,target);
        System.out.println(result);
        
    }
    
}
