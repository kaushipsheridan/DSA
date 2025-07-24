package BinarySearch;

import java.util.PriorityQueue;

public class minMaxDistToGasStation {

    // public static class Pair {
    //     double first;
    //     int second;

    //     Pair(double first, int second) {
    //         this.first = first;
    //         this.second = second;
    //     }
    // }

    // public static double minMaxGas(int[] gasDist, int k){

    //     int n = gasDist.length;
    //     int[] howmany= new int[n-1];

    //     //reversing the behavior of the default min heap PQ
    //     PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> Double.compare(b.first, a.first));

    //     //filling in PQ
    //     for( int i=0; i< gasDist.length-1;i++){
    //         pq.add(new Pair((gasDist[i+1]-gasDist[i]), (i)));
    //     }

    //     //now that PQ is ready, we pull the top element, update it and push it back
    //     for(int gasStation=1; gasStation<=k;gasStation++){

    //         //pulling the topmost pair of PQ
    //         Pair tp = pq.poll();

    //         //getting the element
    //         double firstDiff= tp.first;

    //         //getting the index
    //         int secondIndex= tp.second;

    //         //updating that index in the how many[]
    //         howmany[secondIndex]++;

    //         //GETTING DIFF BTW SECONDinDEX AND SECONDiNEDX +1
    //         double originalDiff = gasDist[secondIndex + 1] - gasDist[secondIndex];

    //         //now we know firstDiff is the difference, updating it 
    //         double newDiff= originalDiff/(1 + howmany[secondIndex]);

    //         //now updating the PQ with newDiff
    //         pq.add(new Pair(newDiff,secondIndex));

    //     }

    //     return pq.peek().first;
    // }


    public static int minGasRequired(double dist, int[] arr){

        int n = arr.length;
        int c=0;

        for(int i =1; i<n;i++){
            int numinBTW= (int)((arr[i] - arr[i-1]) / dist);

            //checking if its exactly divisible
            if( numinBTW * dist == (arr[i] - arr[i-1])){
                numinBTW--;
            }
            
            c+=numinBTW;
        }

        return c;
    }

    public static double minMaxGas(int[] dist, int k){


        double low=0;
        
        double high=0;
        
        //Find the maximum distance:
        for (int i = 0; i < dist.length - 1; i++) {
            high = Math.max(high, (double)(dist[i + 1] - dist[i]));
        }
        

        double diff = 1e-6 ;
        while( high-low>diff){

            double mid = low + (high-low)/2;

            int count = minGasRequired(mid,dist);

            if(count>k){
                low=mid;
            }else{
                high=mid;
            }
        }

        return high;

    }


    public static void main(String[] args) {
        int[] gas = {1,13,17,23};
        int k=5;
        System.out.println(minMaxGas(gas,k));
    }
    
}
