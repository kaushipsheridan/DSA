package Recursion;

public class atoiImplementation {

    private static final int INT_MAX = 2147483647;
    private static final int INT_MIN = -2147483648;

    public static int myatoi(String s){

        //firstly lets clear initial spaces
        s=s.trim();

        //now that we have removed spaced
        //maybe the string just had some spaces
        if(s.isEmpty()) return 0;

        //MANAGING SIGN
        int sign=1;
        if(s.charAt(0)=='-' || s.charAt(0)=='+'){

            sign= (s.charAt(0) =='-') ? -1:1;
            //now for recursion we dont need the sign
            //therefore
            s=s.substring(1);
        }

        return helper(s,0,0,sign);
    }

    public static int helper(String s, int index, long result, int sign){

        //if index of sting is at end || non digit is found
        if(index>=s.length() || !Character.isDigit(s.charAt(index))){
            return (int) (result*sign);
        }

        //now recursively adding the next digit
        result = result*10 + (s.charAt(index)-'0');

        //check for overflow as well
        if(sign==1 && result>INT_MAX) return INT_MAX;
        if(sign==-1 && result<INT_MIN) return INT_MIN;

        //now calling recursive
        return helper(s, ++index, result, sign);
    }

    public static void main(String[] args) {

         System.out.println(myatoi("-12345"));        // -12345
        System.out.println(myatoi("4193 with words")); // 4193
        System.out.println(myatoi("91283472332"));     // 2147483647 (clamped)
        System.out.println(myatoi("-91283472332"));    // -2147483648 (clamped)
        System.out.println(myatoi("+42"));             // 42
        System.out.println(myatoi("00000123"));        // 123   
    }
    
}
