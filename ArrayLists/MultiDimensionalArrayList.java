package ArrayLists;

import java.util.ArrayList;

public class MultiDimensionalArrayList {
    
    //2d Array list

    public static void main(String[] args) {
        /* 
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        mainList.add(list);
        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(3);
        list.add(4);
        mainList.add(list2);
        
        for(int i=0 ; i <  mainList.size() ; i++){
            //now we get the lists that is present in the mainlist>
            ArrayList<Integer> currentList = mainList.get(i);
            for(int j = 0 ; j<currentList.size() ; j++){
                System.out.print(currentList.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(mainList);
    }
        */

        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i = 1 ; i <= 5 ; i++){
            list1.add(i);
            list2.add(i*2);
            list3.add(i*3);
        }
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);

        System.out.println(mainlist);

        for(int i = 0 ; i <mainlist.size() ; i++){
            ArrayList<Integer> currentList = mainlist.get(i); //get the current list
            for(int j = 0 ; j < currentList.size() ; j++){
                System.out.print(currentList.get(j) + " "); //print all the elements of the current list
            }
            System.out.println();
        }
    }    
}
