package Strings;
import java.util.*;

public class isValidPara {

    public static boolean isValidParaCheck(String s ){

        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){

                stack.push(s.charAt(i));
            }else{

                if(stack.isEmpty()){
                    return false;
                }else{

                    char test = stack.pop();

                       if(    (s.charAt(i)=='}' && test=='{')    ||   (s.charAt(i)==')' && test=='(')   ||    (s.charAt(i)==']' && test=='[')){
                    continue;
                }else{
                    return false;
                }

                }

             
            }

          
            
        }

          if(!stack.empty()){
                return false;
            }



        return true;
    }

    public static void main(String[] args) {
        String s = "(]";
        boolean check = isValidParaCheck(s);
        System.out.println(check);
    }
    
}
