package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class sortByFrequency {


    //approach - hashmap with key as the char and value as the frequency
    //sorting the hasmap
    //printing keys from top to bottom
    public static String sortItOut(String s){
        
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), 1);
            }else{
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
        }

        //now that the hashamp is set, lets sort it out
        //first change it to list
        List<Map.Entry<Character,Integer>> sortedList= new ArrayList<>(map.entrySet());

        //sorting in decending order
        sortedList.sort((a,b) -> b.getValue().compareTo(a.getValue()));

        //now that the array list is in ascending order
        //Building the rest of the string

        StringBuilder build = new StringBuilder();
        for(Map.Entry<Character,Integer> entry : sortedList){

            char ch = entry.getKey();
            int count = entry.getValue();

            

        }



        return "";
    }



    public static void main(String[] args) {
        String s = "tree";
        System.out.println(sortItOut(s));    
    }
}
