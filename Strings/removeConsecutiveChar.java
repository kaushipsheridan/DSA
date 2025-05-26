package Strings;

public class removeConsecutiveChar {

    public static String removeConsecutive(String s){

        StringBuilder sb= new StringBuilder(s.length());
        sb.append(s.charAt(0));

        for(int i=1;i<=s.length()-1;i++){

          if(s.charAt(i)!=s.charAt(i-1)){
            sb.append(s.charAt(i));
          }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "abcddcba";
        System.out.println(s);
        String result = removeConsecutive(s);
        System.out.println(result);
    }
    
}
