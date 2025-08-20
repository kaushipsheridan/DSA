package Strings;

public class stringtoIntegerConvert {

    public static int myAtoi(String s){
        StringBuilder sb= new StringBuilder(s.length());
        boolean signfound=false;
        boolean firstdigitfound=false;

        for(int i=0;i<s.length();i++){

            //break if no digit char is found when the first digit char is found
            if(firstdigitfound==true && (!Character.isDigit(s.charAt(i)))){
                break;
            }
            
            //step 1 : ignore widespace
            if(s.charAt(i)==' '){continue;}

            //Step 2 : locate the sign
            if(s.charAt(i) =='+' && !firstdigitfound && !signfound){
                signfound=true;
                continue;   // 
            }else if (s.charAt(i) =='-' && !firstdigitfound && !signfound){
                sb.append("-");
                signfound=true;
                continue;   // 
            }

            //Step 3 : break if a non digit element is found(once firstdigitfound is true), skip inital zeros and add to sb until a non digit is found
            if(Character.isDigit(s.charAt(i))){

                //make first digit found true
                firstdigitfound=true;
                
                sb.append(s.charAt(i));   // ✅ store the digit

            }else{
                break;
            }


        }

       //Handle empty result (like "abc")
        if(sb.length()==0 || sb.toString().equals("-")) return 0;

        //using LONG for large input nums
        long num = Long.parseLong(sb.toString());

        if (num < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if (num > Integer.MAX_VALUE) return Integer.MAX_VALUE;

        return (int) num;
    }

    public static void main(String[] args) {
        String s = "   -042";
        System.out.println(myAtoi(s));
    }
    
}
