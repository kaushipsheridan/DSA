import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {

    public static List<Integer> printSpiral(int[][] mat){

        int top =0;
        int bottom =mat.length-1;
        int right=mat[0].length-1;
        int left=0;

        ArrayList<Integer> list = new ArrayList<>();

        while(top<=bottom && left<=right){

            //printing from top left to top right - so top is constant
            for(int i=left;i<=right;i++)
                list.add(mat[top][i]);

            //top will be updated - case we went in by 1 into the spiral;
            top++;

            //printing from right top to right bottom
            for(int i=top;i<=bottom;i++)
                list.add(mat[i][right]);
            
            //right will be updated - case we went in by 1 into the spiral;
            right--;


            if (top <= bottom) {
                //printing right bottom to left bottom
                for(int i=right;i>=left;i--)
                    list.add(mat[bottom][i]);
                
                //bottom will be updated - case we went in by 1 into the spiral;    
                bottom--;
            }


            if(left<=right){
                //printing from bottom left to top left
                for(int i=bottom;i>=top;i--)
                    list.add(mat[i][left]);
                
                left++;
            }
            


        }



        return list;
    }

    public static void main(String[] args) {
       int[][] mat = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       {13, 14, 15, 16}};

    List<Integer> ans = printSpiral(mat);

    for(int i = 0;i<ans.size();i++){
        System.out.print(ans.get(i) + " ");
    }

    System.out.println();   
    }
    
}
