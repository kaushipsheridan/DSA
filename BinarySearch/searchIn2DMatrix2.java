package BinarySearch;

public class searchIn2DMatrix2 {

    public static boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        //starting from top left!(can also do it from left bottom)
        int r = 0;
        int c = cols - 1;

        //handling the c and r remains in limit
        while (r < rows && c >= 0) {
            if (matrix[r][c] == target) {
                return true;
            } else if (matrix[r][c] > target) {
                c--; // move left- we need a smaller target
            } else {
                r++; // move down - we need a bigger target
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1,  4,  7, 11, 15},
            {2,  5,  8, 12, 19},
            {3,  6,  9, 16, 22},
            {10,13, 14,17, 24},
            {18,21, 23,26, 30}
        };

        int target = 5;
        System.out.println(searchMatrix(matrix, target));
    }
    
}
