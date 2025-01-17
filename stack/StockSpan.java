package stack;

import java.util.Stack;

public class StockSpan {
    
    //given will be 7 days ka  price for a stock
    //we have to find the span of the stack
    //span is max no of consective days for which price <= today's price

    //span --> currentIdx(day) - previous high price
    

    //what we do is we sotre the prices of the stocks in a stack
    //and spans in an array
    //and when we to a day(idx) we see the stack elements if its greater than the price of that day then we remove that elemenmt from that stack
    //and span would be i - prev high price 

    public static void stockSpan(int[] stocks , int[] span) {

        Stack<Integer> s = new Stack<>();
        //the first span of the 0th day is always 1
        span[0] = 1;
        s.push(0);

         
    }

    public static void main(String[] args) {
        int[] stocks = {100,80,60,70,60,85,100};
        int[] span = new int[stocks.length];

        stockSpan(stocks , span);

        for(int i = 0 ; i < span.length ; i++){
            System.out.println(span[i] + " ");
        }
    }
}
