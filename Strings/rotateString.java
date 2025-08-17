package Strings;

public class rotateString {

    public static String reverseThisString(String s){

       StringBuilder sb = new StringBuilder();
        int end = s.length();

        for(int i=s.length()-1;i>=0;i--){

            //if there is space at the end, set it as end 
            if(s.charAt(i)==' '){
                end=i;

            }else if (i==0 || s.charAt(i-1)==' ') {

                //adding space in final string
                if(sb.length()>0){
                    sb.append(" ");
                }

                //adding the word
                sb.append(s.substring(i, end));
            }

        }

      

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        String output= reverseThisString(s);
        System.out.println(output);
    }
    
}
