package Strings;

public class reverseEntireString {

    public static String reversed(String s){

        //removing leading nd trailing spaces
        s=s.trim();

        StringBuilder sb= new StringBuilder(s.length());

        for(int i=s.length()-1;i>=0;i--){

            if(s.charAt(i)!=' '){
                String word = wordMaker(s, i);
                sb.append(word+ "");
            }  else{
                continue;
            }  

        }


        return "";
    }
    public static String wordMaker(String s , int indexStart){

        int j= indexStart;

        while(s.charAt(j-1)==' '){
            j--;
        }

        return s.substring(j,indexStart);
    }
    public static void main(String[] args) {
        String s = "   hello world  ";
        System.out.println(reversed(s));
    }
}
