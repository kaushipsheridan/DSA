import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class pascalTriangle {

    public static List<List<Integer>> printItAll(int numRows){  

        List<List<Integer>> list = new ArrayList<>();

        if(numRows==1){
            list.add(new ArrayList<>(Arrays.asList(1)));
            return list;
        }

        if( numRows==2){
            list.add(new ArrayList<>(Arrays.asList(1)));
            list.add(new ArrayList<>(Arrays.asList(1,1)));
            return list;
        }

        if(numRows>2){

            //adding first row
            list.add(new ArrayList<>(Arrays.asList(1)));
            //adding second row
            list.add(new ArrayList<>(Arrays.asList(1,1)));

            //adding the rest of the rows
            for(int i=2;i<=numRows;i++){

                List<Integer> prevRow= list.get(i-1);
                List<Integer> newRow= new ArrayList<>();

                //as 1 is comman in every row - FIRST ELEMENT
                newRow.add(1);


                //CENTER ELEMENTS
                for( int j=1;j<prevRow.size();j++){
                    newRow.add(prevRow.get(j-1) + prevRow.get(j));
                }

                //as 1 is comman in every row - LAST ELEMENT
                newRow.add(1);


                //now that new row is ready - put it in the list
                list.add(newRow);

            }
        }


        return list;
    }

    public static void main(String[] args) {
        int numRow=5;
        printItAll(numRow);
    }
    
}
