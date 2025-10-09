package Recursion;

import java.util.ArrayList;
import java.util.List;

public class generatingAllBinary {

    public static void generate(int n, String curr, List<String> result){

        //adding a base case
        if(curr.length()==n){
            result.add(curr);
            return;
        }

        //can add 0 alwayss
        generate(n, curr + "0", result);

        //can add 1 under the condition curr-1 must not be ==1
        if(curr.isEmpty() || curr.charAt(curr.length()-1)!='1'){
            generate(n, curr+"1", result);
        }
    }

    public static void main(String[] args) {
         // Input length n
        int n = 3;

        // List to store results
        List<String> result = new ArrayList<>();

        // Start recursion with empty string
        generate(n, "", result);

        // Print results
        for (String s : result) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
    
}
