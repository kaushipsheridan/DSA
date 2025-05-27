package Strings;
public class stringToNum {

    public static String convertToNum(String s){

        String[] arr = {"2","22","222",
                        "3","33","333",
                        "4","44","444",
                        "5","55","555",
                        "6","66","666",
                        "7","77","777","7777",
                        "8","88","888",
                        "9","99","999","9999"};

        String output="";

        for(int i=0;i<s.length();i++){
            
            //rather than ascii, compare with s.charAt(i)==' ' then 0 else LOGIC HERE
            if(s.charAt(i)<=90 && s.charAt(i)>=65){
                output+=arr[((int)s.charAt(i)-65)];
            }else{
                output+=0;
            }
        }


        return output;

    }

    public static void main(String[] args) {

        String s = "HELLO WORLD";
        String result = convertToNum(s);
        System.out.println(result);


        
        
    }
    
}
