package Strings;

public class reverseEntireString {

    public static String reversed(String s){

        //removing leading nd trailing spaces
        s=s.trim();

        StringBuilder sb= new StringBuilder(s.length());

        for(int i=s.length()-1;i>=0;i--){

            if(s.charAt(i)!=' '){
                String word = wordMaker(s, i);
                sb.append(word).append(" ");

                //now that we have addded the last word, we gotta remove the rest of the word(*will also reduce TC --heheheh)
                i-= word.length()-1;

            }  else{
                continue;
            }  

        }


        return sb.toString().trim();
    }
    public static String wordMaker(String s , int indexStart){

        int j= indexStart;

        while(j>0 && s.charAt(j-1)!=' '){
            j--;
        }

        return s.substring(j,indexStart+1);
    }
    
    public static void main(String[] args) {
        String s = "   hello world  ";
        System.out.println(reversed(s));
    }
}
