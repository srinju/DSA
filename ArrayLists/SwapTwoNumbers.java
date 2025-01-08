package ArrayLists;

import java.util.ArrayList;

public class SwapTwoNumbers {
    public static void swap(ArrayList<Integer> list , int i , int j){
        int first = list.get(i);
        int last = list.get(j);
        int temp = first;
        list.set(i, last);
        list.set(j, temp);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list  = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);
        int i = 1 , j = 3; //that means swap the index 1 with index 2
        System.out.println("list before swap  :  " + list);
        swap(list, i, j);
        System.out.println("list after swap : " + list);
    }
}
