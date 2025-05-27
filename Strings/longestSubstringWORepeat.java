package Strings;

import java.util.HashSet;

public class longestSubstringWORepeat {

    //Brute FORCE - NESTED FOR LOOP - O(n)square

    //Better Approach - TC: O(n) and SC : O(ascii char's)
    // public static int findit(String s){

    //     if(s.equals("")){return 0;}
    //     if(s.equals(" ")){return 1;}
    //     HashSet<Character> set = new HashSet<>(256);   
    //     int maxLength=0;
    //     int left=0;
    //     for(int right=0;right<s.length();right++){
    //         while(set.contains(s.charAt(right))){
    //             set.remove(s.charAt(left));
    //             left++;
    //         }
    //         set.add(s.charAt(right));
    //         maxLength= Math.max(maxLength, right -left +1);
    //     }
    //     return maxLength;
    // }


    //Better Approach - TC: O(n) and SC : O(ascii char's)
    public static int findit(String s){

        if(s.equals("")){return 0;}
        if(s.equals(" ")){return 1;}

        HashSet<Character> set = new HashSet<>(256);   
        int maxLength=0;
        int left=0;
        int right=0;

        while(right<s.length()){
            if(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }else{
                set.add(s.charAt(right));
                maxLength= Math.max(maxLength, right-left+1);
                right++;
            }
        }
            return maxLength;
    }

    public static void main(String[] args) {

        String s = "abcabcdff";
        int result=findit(s);
        System.out.println(result);
        
    }
    
}
