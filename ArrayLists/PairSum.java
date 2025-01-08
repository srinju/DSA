package ArrayLists;

import java.util.ArrayList;

public class PairSum {
    
    //PROBLEM STATEMENT >

    //find if any pair in a sorted arraylist has a target sum
    //list = [1,2,3,4,5,6] , tzrget = 5

    //APPROACH>

    //we have to find a pair such that the pair's sum is equal to the target


    //brute force approach >

    public static ArrayList<String> pairSum(ArrayList<Integer> list , int target){
        ArrayList<String> pairs = new ArrayList<>();
        for(int i = 0 ; i < list.size() ; i++){
            for(int j = i+1 ; j <list.size() ; j++){
                if((list.get(i) + list.get(j)) == target){
                    pairs.add("(" + list.get(i) + "," + list.get(j) + ")" );
                }
            }
        }
        return pairs;
    }

    //optimised approach >

    public static ArrayList<String> pairSumOptimiesed(ArrayList<Integer> list , int target){ //only coz that is a sorted array
        ArrayList<String> pairs = new ArrayList<>();
        int i = 0;
        int j = list.size()-1;
        while(i!=j){
            if((list.get(i) + list.get(j)) == target){
                pairs.add("(" + list.get(i) + "," + list.get(j) + ")" );
            }
            if((list.get(i) + list.get(j)) < target){ //if the sum is less than the target then we move to the larger values in the array as the array is sorted
                i++;
            } else { //else we move to the smaller values in the array
                j--;
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target = 5;

        ArrayList<String> pairs = pairSumOptimiesed(list, target);

        if(pairs.isEmpty()){
            System.out.println("no pairs");
        } else {
            System.out.println("pairs are : ");
            for(int i = 0 ; i < pairs.size() ; i++){
                System.out.print(pairs.get(i) + " ");
            }
            System.out.println();
        }
    }
}
