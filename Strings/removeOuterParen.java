package Strings;

public class removeOuterParen {


    public static String removeParen(String s){

        StringBuilder sb= new StringBuilder();

        int counter=0;
        
        for(int i=0; i<s.length();i++){

            int tempCount=counter;

            if(s.charAt(i)==')'){
                counter--;
            }

            //THis is okay, Lets try something better
            // if(counter!=0){
            //     sb.append(s.charAt(i));
            // }

            if(s.charAt(i)=='('){
                counter++;
            }

            //this checks if the counter went from 0-1 or it went from 1-0, in either case do not include
            //s.charAt(i) in the string builder
            if(!(tempCount==0 && counter==1) && !(tempCount==1 && counter==0)){
                sb.append(s.charAt(i));
            }

        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "(()())(()";
        String output =  removeParen(s);
        System.out.println(output);
    }
    
}
