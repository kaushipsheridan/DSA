import java.util.Arrays;

class Pair{
    long min;
    long max;
}

class getMinMaxofArray{

    //THis gives Time and space complexity ofO(nlogn) complexity - Not the best
    // public static Pair getanswer(int[] arr){
    //     Pair p = new Pair();
    //     Arrays.sort(arr);
    //     p.min=arr[0];
    //     p.max=arr[arr.length -1];
    //     return p;
    // }

    //THis is better as it uses TC of O(n) and Space complexity of O(1)
    public static Pair getanswer(int[] arr){
        Pair p = new Pair();
        
        p.min=Integer.MAX_VALUE;
        p.max=Integer.MIN_VALUE;
        for(int i: arr){
            if(i<=p.min){
                p.min=i; }
            if(i>=p.max){
                p.max=i; }
        }
        return p;
    }

    public static void main(String[] args) {
        int[] arr = {3425,45,23,565574,234};
        Pair result = getanswer(arr);
        System.out.println(result.min + " and " + result.max);
        
    }
}