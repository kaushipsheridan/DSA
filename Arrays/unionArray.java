import java.util.ArrayList;

public class unionArray {

    public static int[] unionit(int[] nums1, int[] nums2){

        int i=0;
        int j=0;

        ArrayList<Integer> list = new ArrayList<>();

        //adding based on quick comparison first

        while(i<nums1.length && j<nums2.length){

            //skipping same elements after adding them only once
            if(nums1[i]==nums2[j] && list.get(list.size()-1)!=nums1[i]){
                list.add(nums1[i]);
                i++;j++;
            }
            else if(nums1[i]<nums2[j]){
                if(!list.isEmpty() || list.get(list.size()-1)!=nums1[i]){
                    list.add(nums1[i]);
                }
                i++;
            }else{

                if(!list.isEmpty() || list.get(list.size()-1)!=nums2[j]){
                    list.add(nums2[j]);
                }
                j++;
            }
        }


        //Now add on remaining of the Arr1 elements ....


        //Also add on the remaining of the Arr2 elements....



         // Convert List<Integer> to int[]
        int[] result = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            result[k] = list.get(k);
        }


        return result;
    }

    public static void main(String[] args) {

        int[] nums1= {1, 2, 3, 4, 5};
        int [] nums2={1,2,7};

        int[] newint = unionit(nums1, nums2);
        for(int i:newint){
            System.out.println(i);
        }
        
    }
    
}
