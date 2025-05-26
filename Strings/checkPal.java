package Strings;

public class checkPal {

    public static boolean checkPalindrome(String s){

         s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

         System.out.println(s);
        int l=0;
        int r=s.length()-1;
        while(l<=r){
            if(s.charAt(l)!= (s.charAt(r))){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        boolean check = checkPalindrome(s);
        System.out.println(check);
        
    }
}
