package Strings;

import java.util.Arrays;
public class validAnagram {

    //Naive Approach - TC - O(nlogn) and SC - O(n)

    // public static boolean checkAnagram(String s , String t){
    //     char[] a = s.toCharArray();
    //     char[] b =t.toCharArray();
    //     Arrays.sort(a);
    //     Arrays.sort(b);
    //     return Arrays.equals(a,b);
    // }

    //Better Approach - loop - TC : O(n + m)  SC: O(n + m)
    public static boolean checkAnagram(String s , String t){

        s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        t=t.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int[] numarray= new int[26];
        
        for(int i=0;i<s.length();i++){
            numarray[(int)s.charAt(i)- 97]++;
        }

        for(int j=0;j<t.length();j++){
            numarray[(int)t.charAt(j)-97]--;
        }

        for(int hehe : numarray){
            if(hehe!=0){
                return false;
            }
        }



        return true;
    }

    public static void main(String[] args) {

        String s = "anagram"; String t = "nagaram";

        boolean check = checkAnagram(s,t);
        System.out.println(check);
        
    }
    
}
