package BinarySearch;

public class searchIn2DMatrix {

    // //TC is O(log m + log n) and SC is O(1)   --- Very Good Approach , but still room for improvement!
    // public static boolean searchMatrix(int[][] matrix, int target) {

    //     int Rleft=0;
    //     int Rright=matrix.length-1;
    //     System.out.println(Rright);

    //     while(Rleft<=Rright){

    //         int mid= Rleft+ (Rright-Rleft)/2;

    //         //getting length of the selected row
    //         int rowLen= matrix[mid].length-1;

    //         if(target>=matrix[mid][0] && target<= matrix[mid][rowLen]){
    //             return checkThisRow(matrix[mid],target);
    //         }else if(target<=matrix[mid][0]) {
    //             //eliminate right ,move left
    //             Rright=mid- 1;
    //         }else{
    //             //eliminate left, move right 
    //             Rleft = mid + 1;
    //         }





            
    //     }
    //     return false;
    // }


    // public static boolean checkThisRow(int[] row, int target){

    //     int left = 0;
    //     int right = row.length - 1;

    //     while (left <= right) {
    //         int mid = left + (right - left) / 2;

    //         if (row[mid] == target) {
    //             return true;
    //         } else if (target < row[mid]) {
    //             right = mid - 1;
    //         } else {
    //             left = mid + 1;
    //         }
    //     }

    //     return false;
    // }


    //optimised APPROACH - CHECK NOTES FOR FORMULAE - 
    public static boolean searchMatrix(int[][] matrix, int target){

        int numofRows= matrix.length;
        int numofCol=matrix[0].length;

        int left=0;
        int right=numofCol*numofRows - 1;

        //we know, ans is from 0 - 11 index if the array was 1D, assume it is 1D

        while(left<=right){
            int mid = left + (right-left)/2;

            int row= mid/numofCol;
            int col= mid%numofCol;

            if(matrix[row][col] ==target){
                return true;
            }else if(target<matrix[row][col] ){
                //eliminate right, move left
                right=mid-1;
            }else{
                //eliminate left, move right
                left=mid+1;
            }
        }

        return false;
    }





    public static void main(String[] args) {
        int[][] matrix= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=15;
        System.out.println(searchMatrix(matrix ,target));
    }
    
}
