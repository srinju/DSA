public class buyAndSellStock2 { //similar as prv buy and sell stock but here there is unlimited transactions available that is buying and selling
    public int maxProfit(int[] prices) {
        
        //if we visualise correctly then we can see that the profit is when the graph of the stocks is going higher
        //so we traverse through the loop
        //and see if the prevous value is less than the next  value then there is rise in graph  ---> so profit
        //therefore we add the profit

        int n = prices.length;
        int profit = 0;
        for(int i = 1 ; i < n ; i++){
            if(prices[i] > prices[i-1]){
                profit = profit + (prices[i] - prices[i-1]);
            }
        }
        return profit;
    }
}
