public class maxConseZeros {

    public static int maxOneFind(int[] nums){

    int superMax=0;
    int currMax=0;

    for(int i: nums){
        if(i==1){
            currMax++;
            superMax=Math.max(superMax, currMax);
        }else{
            currMax=0;
        }
    }

    return superMax;
    
    }

    public static void main(String[] args) {
        int[] nums= {0,1,0,1,1,1,1,1,0,1,1,1,1,1,1,1};
        System.out.println(maxOneFind(nums));

    }
    
}
