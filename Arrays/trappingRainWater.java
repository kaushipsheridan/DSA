import javax.crypto.AEADBadTagException;

public class trappingRainWater {



    // // Better Approach 
    // public static int trap(int[] height){

    //     int result=0;

    //     int[] leftmax = new int[height.length];
    //     int[] rightmax= new int[height.length];

    //     leftmax[0]= height[0];
    //     rightmax[height.length-1]=height[height.length-1];

    //     //finding max height to the left of every element
    //     for(int i=1;i<height.length;i++){
    //         leftmax[i]= Integer.max(leftmax[i-1], height[i]);
    //     }

    //     //finding maxheight on the right of every element
    //     for(int j=height.length-2;j>=0;j--){
    //         rightmax[j] = Integer.max(rightmax[j+1], height[j]);
    //     }

    //     //now finding the smaller boundary at each element by comparing leftmax and right max
    //     for(int i=0;i<height.length;i++){
    //         result += (Integer.min(leftmax[i], rightmax[i])) - height[i];
    //     }

    //     return result;

// }
    // }


  //Ideal Approach - Time complexity O(n) and Space Complexity O(1)

    public static int trap(int[] height){

        int l=0;
        int r= height.length-1;

        int lmax=0;
        int rmax=0;   

        int result=0;


        while(l<r){ 

            lmax = Math.max(height[l], lmax);
            rmax= Math.max(height[r], rmax);

            if(lmax<rmax){
              result+=(lmax-height[l]);
              l++;
            }else {
                result+=(rmax -height[r]);
                r--;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] height= {4,2,0,3,2,5,2,1,2};
        int answer= trap(height);
        System.out.println(answer);
        
    }
    
}
