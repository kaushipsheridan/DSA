package Strings;

import java.util.ArrayList;

public class longestPalindromicString {
    
    public static String longestFind(String s){

        //Lets iterate through every char and see if they happen to be the center of the palindrome

        String maxString = s.substring(0,1);
        ArrayList<String> arr= new ArrayList<>();


        for(int i=0;i<s.length();i++){
            // check odd-length palindrome (center at i)
            String odd = checkForThisOne(i, i, s);

            //checking for even palindrome
            String even = checkForThisOne(i, i+1, s);

            //picking longer one 
            String longer = odd.length()>even.length()? odd:even;
            

            //update max if longer found
            if(longer.length()>maxString.length()){
                maxString=longer;
            }
            }

            return maxString;
        }

    public static String checkForThisOne(int leftIndex, int rightIndex, String s){

        
          while(leftIndex >=0 && rightIndex < s.length() && s.charAt(leftIndex) == s.charAt(rightIndex)){
            leftIndex--;
            rightIndex++;
        }

        // after loop ends, last valid palindrome was one step before
        return s.substring(leftIndex+1, rightIndex);

    }
    public static void main(String[] args) {
        String s = "abbzbza";
        System.out.println(longestFind(s));
    }
}
