package Strings;

import java.util.*;

public class longestCommanPrefix {
    
    //Good Approach -       TC-O(n*m)     SC-O(m)
   // public static String getLongest(String[] strs){
    //     String s = strs[0];
    //     StringBuilder stringB= new StringBuilder(strs[0]);

    //     for(int i=1;i<strs.length;i++){
    //         while(!strs[i].startsWith(stringB.toString())){
    //             stringB.deleteCharAt(stringB.length()-1);

    //             if(stringB.isEmpty()){
    //                 return "";
    //             }
    //         }
    //     }
    //     return stringB.toString();
    // }


    //Better Approach - TC is same but SC is O(1)
    public static String getLongest(String[] strs){

        String prefix=strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
    public static void main(String[] args) {

        String[] stres= {"flower","flow","flight"};
        String ans= getLongest(stres);
        System.out.println(ans);
        
    }
    
}
