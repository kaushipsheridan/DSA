package BinarySearch;

public class peakElementin2DArray {

    //best complexity : O(nLogm) or O(mLogn)   SC is O1
    public static int[] findPeakGrid(int[][] mat) { 

        //taking all cols from left to right
        int left =0;
        int right= mat[0].length-1;
        int totalRows= mat.length;

        while(left<=right){

            int mid = left + (right-left)/2;
            int rowIndex= findMaxinColumn(mat,mid,totalRows); 

            int midVal= mat[rowIndex][mid];
            //incase we are outside the given matrix(assume its -1)
            int leftNeighbor = (mid - 1 >= 0) ? mat[rowIndex][mid - 1] : Integer.MIN_VALUE;
            int rightNeighbor = (mid + 1 < mat[0].length) ? mat[rowIndex][mid + 1] : Integer.MIN_VALUE;

            //now we check the element at mat[rowIndex][mid] nd compare it with mat[rowIndex][mid1-1] and 
            //mat[rowIndex][mid+1]

            if(midVal>=leftNeighbor && midVal>=rightNeighbor){  
                return new int[]{rowIndex,mid};
            }else if(midVal<leftNeighbor ) {
                //peak if on the left -- eliminate right
                right=mid-1;
            }else{
                //peak is on the right --- eliminate left
                left=mid+1;
            }

        }
        
        return new int[]{-1,-1};
    }

    public static int findMaxinColumn(int[][] matrix, int colNum, int totalRows){
        
        int maxRowIndex = 0;
        for (int i = 1; i < totalRows; i++) {
            if (matrix[i][colNum] > matrix[maxRowIndex][colNum]) {
                maxRowIndex = i;
            }
        }
        return maxRowIndex;
    }

    public static void main(String[] args) {
        int[][] matrix= {{10,20,15}, {21,30,14}, {7,16,32} };
        int[] res =  findPeakGrid(matrix);

        for(int i : res){
            System.out.println(i);
        }
    }
    
}
