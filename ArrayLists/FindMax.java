package ArrayLists;

import java.util.ArrayList;

public class FindMax {
    public static int findMax(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<list.size() ; i++){
            /* 
            if(max < list.get(i)){
                max = list.get(i);
            }
                */
            max = Math.max(max, list.get(i));
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);
        System.out.println("the max number in the array list is : " + findMax(list));
    }
}
