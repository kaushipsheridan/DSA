package Strings;

import java.util.HashMap;
import java.util.Map;

public class romanToInteger {

    // //TC is On nd SC is O1
    // public static int convertIt(String s){

    //     int curr=0;
    //     int next=1;

    //     int answer=0;

    //     Map<Character,Integer> map = Map.of(
    //         'I',1,
    //         'V', 5,
    //         'X', 10,
    //         'L', 50,
    //         'C', 100,
    //         'D', 500,
    //         'M', 1000
    //     );

    //     //LOGIC If map.get(current) < map.get(next) → subtract current.    Else → add current.

    //     while(curr<=s.length()-1){

    //         //adding or subtracting from index 0 to second last
    //         if(next<=s.length()-1){
    //             //LOGIC If map.get(current) < map.get(next) → subtract current.    Else → add current.
    //              if(map.get(s.charAt(curr)) < map.get(s.charAt(next))) {
    //                 answer-=map.get(s.charAt(curr));
    //              }else{
    //                 answer+=map.get(s.charAt(curr));
    //              }
    //         }else{
    //             //adding the last one 
    //             answer+=map.get(s.charAt(s.length()-1));
    //         }
    //         curr++;
    //         next++;
    //     }
    //     return answer;
    // }



    //lets make this more optimised::::
    //TC is On nd SC is O1

    public static int convertIt(String s){

        int ans=0;
        for(int i =0;i<s.length();i++){
            int curr = valueof(s.charAt(i));
            int next = (i+1<s.length()) ? valueof(s.charAt(i+1)) : 0; 

            if(curr<next){
                ans-=curr;
            }else{
                ans+=curr;
            }
        }

        return ans;
    }

    public static int valueof(Character c){

        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default:
                throw new IllegalArgumentException("okayyy??");
        }
    
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(convertIt(s));
    }
}
