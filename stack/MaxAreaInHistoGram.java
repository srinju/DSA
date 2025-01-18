package stack;

import java.util.Stack;

public class MaxAreaInHistoGram {
    
    /*

     Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.

    heights = [2, 1, 5, 6, 2, 3]

    */

    //APPROACH >>

    //area is hieght * wifth
    //for that we have to find  the max area of a rectangle at current idx
    //for that if we analyse nicely we will find that 
    //from the current idx the next smaller left and next smaller right if we know then
    //next smaller left theeke sidha next smaller right obdi apaner max rectangle asche for that particular idx
    //we find the width from the above appoarch
    //and then we find the max area of a rectangle we can have for each index
    //and get the max as the answer

    public static void maxArea(int[] heights){

        int n = heights.length;
        int[] nextSmallerRight = new int[n];
        int[] nextSmallerLeft =  new int[n];
        int maxArea = 0;

        //next smaller right>>>

        Stack<Integer> s = new Stack<>();

        for(int i  = n-1 ; i>=0 ; i--){
            while(!s.isEmpty() && heights[i] <= heights[s.peek()]){
                s.pop();
            }
            //tokhon smaller pe gelam
            if(s.isEmpty()){
                nextSmallerRight[i] = -1;
            } else {
                nextSmallerRight[i] = s.peek();
            }
            s.push(i);
        }

        //next smaller left >>

        s = new Stack<>();

        for(int i = 0 ; i < n ; i++){
            while(!s.isEmpty() && heights[i] <= heights[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nextSmallerLeft[i] = -1;
            } else {
                nextSmallerLeft[i] = s.peek();
            }
            s.push(i);
        }

        //current area = heright * width>
        //width = j - i - 1;
        for(int i = 0 ; i < n ; i++){
            int height = heights[i];
            int width = nextSmallerRight[i] - nextSmallerLeft[i] - 1;
            int currentArea = height * width;
            maxArea = Math.max(currentArea , maxArea);
        }

        System.out.println("max area of the histogram is : " + maxArea);

    }
    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};

        maxArea(heights);

    }
}
