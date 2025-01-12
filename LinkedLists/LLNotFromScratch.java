package LinkedLists;
import java.util.LinkedList;

public class LLNotFromScratch {
    
    public static void main(String[] args) {
        
        //create>
        LinkedList<Integer> ll = new LinkedList<>();
        
        //add>(normal add Last)
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        System.out.println(ll);

        ll.addFirst(0);
        ll.addFirst(-1);
        ll.addLast(6);

        System.out.println(ll);

        //remove >

        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
        ll.remove(2); //remove element at n index
        System.out.println(ll);
        ll.removeAll(ll); //makes the ll empty
        System.out.println(ll);
        
    }
}
