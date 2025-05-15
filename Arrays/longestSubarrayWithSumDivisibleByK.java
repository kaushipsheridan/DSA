import java.util.HashMap;

public class longestSubarrayWithSumDivisibleByK {

    public static int longestSubarrayDivK(int[] arr, int k) {

        int maxlength=0;
        int[] prearr = new int[arr.length];
        HashMap<Integer,Integer> map = new HashMap<>();

        //Building prefix array
        prearr[0]= arr[0];
        for(int i=1;i<arr.length;i++){
            prearr[i]=arr[i] + prearr[i-1];
        }

        //Main Logic - Check Notes
        for(int i=0;i<prearr.length;i++){
            if(map.containsKey(prearr[i]%k)){
                maxlength= Math.max(maxlength, i - map.get(prearr[i]%k));
            }  else{
                map.put(prearr[i]%k, i);
            }
        }
        return maxlength;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 6, 1, 4, 5};
        int k=3;
        System.out.println(longestSubarrayDivK(arr,k));
    }
}
