package Strings;

import java.util.HashMap;

public class isIsomorphicString {

    public static boolean isIsomorphic(String o, String r){
        
        //firstly, if string size's are not same -> return false;
        if(o.length()!=r.length()){
            return false;
        }

        //this will still be in constant space as the capacity wont be changed later
        HashMap<Character,Character> map = new HashMap<>(256);

        for(int i =0; i<o.length();i++){

            char original=o.charAt(i);
            char replacement=r.charAt(i);

            //checking to see if original exist in the hashmap already
            if(!map.containsKey(original)){

                //if map doesn't have a key = original

                //also check if map has a value = replacement

                if(!map.containsValue(replacement)){
                    //add the key and value
                    map.put(original, replacement);
                }else{
                    return false;
                }

            }else{
                char tempreplacement= map.get(original);
                if(replacement!=tempreplacement){
                    return false;
                }
            }
        }




        return true;
    }

    public static void main(String[] args) {
        String s ="egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));
    }
    
}
