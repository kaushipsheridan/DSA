package Recursion;

public class powFast {

    public static double myPow(double x, int n) {

        long N = n;
        if(N<0){
            x=1/x;
            N=-N;
        }

        return fastPow(x,n);
    }

    public static double fastPow(double x, long n){

        //firstly if x is zero then return 1 : exception handling 
        if(n==0){
            return 1.0;
        }

        double half = fastPow(x,n/2);


        if(n%2==0){
            return half*half;
        }else
            return half*half*x;
        


    } 

    public static void main(String[] args) {

        double rel = myPow(2.0, 5);
        System.out.println(rel);
    }    
}
