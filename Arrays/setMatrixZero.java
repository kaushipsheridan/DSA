public class setMatrixZero {

    public static int[][] setItZero(int[][] nums){


        
        return null;
    }

    public static void main(String[] args) {
        
        //3rows , 4 columns
        int[][] nums=  {
                            {0, 1, 2, 0},
                            {3, 4, 5, 2},
                            {1, 3, 1, 5}
                        };

        setItZero(nums);

        //printing
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(nums[i][j] + " ");
        }
            System.out.println(); // new line after each row
        }


        
    }
    
}
