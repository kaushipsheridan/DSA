import java.util.Arrays;

class Pair{
    long min;
    long max;
}

class getMinMaxofArray{

    public static Pair getanswer(int[] arr){
        Pair p = new Pair();
        Arrays.sort(arr);
        p.min=arr[0];
        p.max=arr[arr.length -1];
        return p;
    }
    public static void main(String[] args) {
        int[] arr = {3425,45,23,565574,234};
        Pair result = getanswer(arr);
        System.out.println(result.min + " and " + result.max);
        
    }
}