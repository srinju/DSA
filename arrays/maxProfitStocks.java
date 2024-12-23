public class maxProfitStocks{
    public int maxProfit(int[] prices) {
        //basically here is like return the profit max difference between two elements of an array 
        //the difference should be j - 1 that is right element - the left element
        //arr prices taken as input which is the prices of the stocks for each day .... day is the index
        //we take a minsofar variable and in that we init store the first element of the prices as the price is less in the first day of the stock
        //then we traverse through the loop and we find the min of buying price 
        //and then we find the max of the selling price , that is math.max(res , arreleemnt - minsofar)
        //we use this approach coz if the buy price is less and sell price is more then only we get max profit 
        
        int n = prices.length; 
        int minSoFar = prices[0];
        int maxProfit = 0;
        for(int i = 0 ; i < n ; i++) {
            minSoFar = Math.min(minSoFar , prices[i]);
            maxProfit = Math.max(maxProfit , prices[i] - minSoFar);
        }
        return maxProfit;
    }
}