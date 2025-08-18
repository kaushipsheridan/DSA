package Strings;

public class stringRotate {

    public static boolean checkIfRotated(String s, String goal){

        if(s.length()!=goal.length()){
            return false;
        }
        return (s+s).contains(goal);
    }

    public static void main(String[] args) {
        String s ="abcde";
        String goal="cdeab";
        System.out.println(checkIfRotated(s,goal));
    }
    
}
