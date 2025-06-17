public class rotateImage {

    public static void rotate(int[][] matrix){

        //transposing the matrix - Rows becomes columns and columns becomes rows

        //traversing right half to diagonal - Left half gets automatically switched
        for(int i=0; i<matrix.length-1;i++){
            for(int j=i+1;j<matrix.length;j++){

                //swapping matrix i,j to j,i
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }


        //now reversing every row;

        for(int i=0;i<matrix.length;i++){

            //first element of every row
            int left=0;
            //last element of every row
            int right=matrix.length-1;

            //swap - 2 pointer approach
            while(left<=right){

                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;

                left++;
                right--;

            }
        }


    }

    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};


        rotate(matrix);

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        
    }
    
}
