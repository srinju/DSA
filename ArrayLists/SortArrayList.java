package ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    //we can use any sorting technique in the arraylist also
    //but for inbuild method we use Collections.sort(list);
    //in normal arrays we used to do Arrays.sort(arr);

    //there are two type of collections
    //collection is an interface
    //collections is a class
    //we use the class to do the sorting

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);
        //ascending order >
        Collections.sort(list);
        System.out.println(list); //[2, 5, 6, 8, 9]
        //descending order>
        Collections.sort(list,Collections.reverseOrder()); //this Collections.reverseOrder() is a comparatore they decide which type of sorting will be ther
    }
}
