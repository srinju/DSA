package ArrayLists;

import java.util.ArrayList;

public class FindMax {
    public static int findMax(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < list.size()-1 ; i++){
            for(int j = i+1 ; j<list.size() ; j++){
                if(list.get(i) > list.get(j)){
                    max = list.get(i);
                } else {
                    max = list.get(j);
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("the max number in the array list is : " + findMax(list));
    }
}
