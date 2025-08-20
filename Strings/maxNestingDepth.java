package Strings;

public class maxNestingDepth {

    public static int maxNestingDepthfind(String s){
        
        int count = 0 ;
        int maxCount=-1;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){

                //update maxCount
                maxCount=Math.max(maxCount, count);

                //reduce count
                count--;
            
            }else if (s.charAt(i)=='('){
                count++;
            }else{
                continue;
            }

        }

        return maxCount;


    }

    public static void main(String[] args) {
        String s = "(1)+((2))+(((3)))";
        int maxDepth = maxNestingDepthfind(s);
        System.out.println("Maximum Nesting Depth: " + maxDepth);
    }
    
}
