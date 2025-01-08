package ArrayLists;

import java.util.ArrayList;

public class theory {
    public static void main(String[] args) {
        //arraylists are a part of java collections framework
        //collections framework is a framework in java for which we can use multiple in build data structures in our java program

        //arraylists are implemented in code as an array only internally
        //when the array is filled in memory java doubles the size of the array internally and copies the previous list to the double sized array
        //and hence all the new elements that gets added , gets added in the new arraylist 

        ArrayList<Integer> list = new ArrayList<>(); //with the new keyword we make the space of the arraylist in our heap memory
        //ArrayList<String> list2 = new ArrayList<>();
        //ArrayList<Boolean> list3 = new ArrayList<>();

        //operations

        //Add element --> to add each eleemtnet we use linear time that is O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        //System.out.println(list); //we get [1,2,3] as the list

        //get element>
        int element = list.get(1); //we get the element in the list at index 1 --> happens in O(1)
        //System.out.println(element); 

        //remove element > --> O(n)
        list.remove(2); //remove the element in the 2nd index of the list
        //System.out.println(list); //[1,2]

        //set element at index>
        list.set(1, 10) ; //in the 1 index place 10 as the number that is there
        //System.out.println(list); //[1,10]

        //contains eleement>
        /* 
        System.out.println(list.contains(1)); //true
        System.out.println(list.contains(10)); //true
        System.out.println(list.contains(2)); //false
        */


        //O(n)
        list.add(0,9);
        System.out.println(list); //at 0th index 9 becomes added and [9,1,10]
        list.add(3,11);
        System.out.println(list);

        //size of the array list>
        System.out.println(list.size()); //4

        //print arrqayList>  each index of the array list fets printed
        for(int i =0 ; i < list.size() ; i++){
            System.out.println(list.get(i));
        }
    }
}
