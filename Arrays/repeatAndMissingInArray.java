import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class repeatAndMissingInArray {

    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static ArrayList<Integer> repeatedNumber(final List<Integer> A) {

       int n = A.size();

       Long actSum=0L;
       Long actSquareSum=0L;

       //Actual Sum and Actual Square Sum
       for(int i : A){
        actSum+=i;
        actSquareSum += (i*i);
       }

       //Expected sum
       Long expSum = (long)((n*(n+1))/2);

       //EXPECTED Sum of Squares
       Long expSqaureSum = (long)((n*(n+1)*(2*n +1))/6);

       //CALCULATE and derive Equations

       //Eq-1
       Long misplusrep = (actSquareSum-expSqaureSum)/ (actSum - expSum);

       //Eq-2
       Long misminusrep= actSum-expSum;

       //Eq-3getting repeated num from Eq1 and Eq2
       Long repeatedNum = (misminusrep + misplusrep) / 2;

       //getting missing sum from Eq3 and Eq1
       Long missingNum = repeatedNum - misminusrep;
        
        ArrayList<Integer> result = new ArrayList<>();
        result.add(repeatedNum.intValue());
        result.add(missingNum.intValue());
        return result;
    }


    public static void main(String[] args) {

        List<Integer> arrlist= new ArrayList<>();
        arrlist.add(2);
        arrlist.add(2);


        ArrayList<Integer> arrnew = repeatedNumber(arrlist);

        for(int i: arrnew){
            System.out.println(i);
        }

        
        
        
    }
    
}
