package Strings;

public class largestOddNumber {

    public static String returnOdd(String s){

        int index=0;

        for(int i=s.length()-1;i>=0;i--){
            if((int)s.charAt(i)%2!=0){

                index=i;
                break;
            }
        }

       if(index!=0){
        return s.substring(0, index+1);
       }else if (index==0){
            if((int)s.charAt(index)%2!=0){
                return  s.charAt(index)+"";
            }
       }


       return "";


    }
 
    public static void main(String[] args) {
        String s = "444";
        System.out.println(returnOdd(s));
    }
    
}
 