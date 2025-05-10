public class stockBuyorSell {

    public static int maxProfit(int[] prices){

        int BP=prices[0];
        int profit=0;

        for(int SP=1;SP<prices.length;SP++){
            if(BP>prices[SP]){
                BP=prices[SP];

            } 
                profit = Math.max(profit,prices[SP]- BP);
            
        }

        return profit;

    }
    public static void main(String[] args) {
   
        int [] prices = {7,1,5,3,6,4};
        int result = maxProfit(prices);
        System.out.println(result);
        
    }
}
