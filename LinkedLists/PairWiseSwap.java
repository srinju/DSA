package LinkedLists;

public class PairWiseSwap {
    
    public static class Node {

        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    public  void addLast(int data) {

        Node newNode = new Node(data);
        size++;
        if(head == null){ //ll is empty
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail =  newNode;

    }

    public  void printList() {

        if(head == null){
            System.out.println("ll is empty");
        }

        Node current = head;

        while(current != null){

            System.out.print(current.data + " -> ");
            current = current.next;

        }
        System.out.println("null");

    }

    public Node pairWiseSwap(Node head){

        //APPORACH >

        //we take a dummy node and get a starting point(a viewing point)
        //the firstNode is swap1
        //the scondNode is swap2
        //and we hyave to swap swap1 and swap2
        //we cans see that the swap1 willbe connected to swap2.next
        //and swap2 comes in swap1 place that is swap2.next = swap1
        //and now we made swap
        //now for theother pair we need to increment the pointers
        //so we put out point of viewing to swap1 that is the prev of teh next pair head
        //and then do the same

        if(head.next == null || head == null){
            return head;
        }

        Node dummy = new Node(-1); //dummt node

        dummy.next = head; //dummy node points to the head

        Node point = dummy; //point where we stand and obeserver the swap of the next two nodes
        //next two nodes from where we are are > point.nerxt and point.next.next

        while(point.next != null && point.next.next != null){
            //connect the swap2 Node with the swap1
            Node swap1 = point.next;
            Node swap2 = point.next.next;

            //perform swap
            swap1.next  = swap2.next;
            swap2.next = swap1;
            
            //swapping happende now update the point of view >
            point.next = swap2;
            point = swap1;

        }

        return dummy.next;
        
    }

    public static void main(String[] args) {
        
        PairWiseSwap ll = new PairWiseSwap();

        ll.addLast(5);
        ll.addLast(19);
        ll.addLast(19);
        ll.addLast(3);
        ll.addLast(5);
        ll.addLast(6);

        ll.head = ll.pairWiseSwap(ll.head);
        ll.printList();

    }
}
