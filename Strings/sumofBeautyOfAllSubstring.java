package Strings;

import java.lang.reflect.Array;

public class sumofBeautyOfAllSubstring {

    public static int beautySum(String s){

        int beautyS=0;

        for(int i=0;i<s.length();i++){

            //freq for every char
            int[] freq= new int[26];

            for(int j=i;j<s.length();j++){
                
                freq[s.charAt(j)-'a']++;

                int minFreq=Integer.MAX_VALUE;
                int maxFreq=Integer.MIN_VALUE;

                //getting max nd min freq
                for(int f: freq){
                     if (f > 0) {
                        maxFreq = Math.max(maxFreq, f);
                        minFreq = Math.min(minFreq, f);
                    }
                }

                beautyS+=(maxFreq-minFreq);
            }
        }
        return beautyS;
    }
    public static void main(String[] args) {
        String s = "aabcb";
        System.out.println(beautySum(s));
        
    }
    
}
