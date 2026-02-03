package Recursion;

import java.util.ArrayList;
import java.util.List;

public class palindromePartition {

    // class Solution {
    public List<List<String>> partition(String s) {

        List<List<String>> result = new ArrayList<>();
        backtrack(s,0,new ArrayList<>(),result);
        return result;
        
    }

    public void backtrack(String s, int start, List<String> currentList, List<List<String>> result){


        //BASE CASE - if we are at the end of the string
        //add the current subset to result
        if(start==s.length()){
            result.add(new ArrayList<>(currentList));
            return;
        }

        //NOW LOOPING THROUGH EVERY POSSIBLE PARTITION

        for(int end =start; end<s.length(); end++){

            //checking if the current String is Pal first
            if(isPal(s,start,end)){

                //Choosing the substring
                currentList.add(s.substring(start,end+1));

                //exploring - moving to char after end
                backtrack(s,end+1,currentList, result);

                //Unchoose - backtracking
                currentList.remove(currentList.size()-1);

            }
        }
    }



    //helper function to check palindrome
    public boolean isPal(String s , int low, int high){
        while(low<high){
            if(s.charAt(low++)!=s.charAt(high--)){
                return false;
            }
        }

        return true;
    }
}
    
}
