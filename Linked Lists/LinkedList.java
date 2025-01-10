
    
    /*
    Linked List >

        every node consists of two things -> one is the data that node consists 
        And another one is the address of the next node(reference variable)

        Reference variables are variables that point to an object.  And the object is nothing but the node

        Therefore linked list is nothing but a class which has multiple nodes as objects

        Class Node {
            Int daata;
            Node next; //next will point to a next node . So it is a same type of object that tht class Node is
            Punlic Node(int data){
                This.data = data; //populate the data in that node
                This.next = null; //point the next address as null intitially
            }

        }    
            
        There are two main nodes in a LL they are the head node and the tail node.
        The head node is the one that is the first node and the tail node is tihe one that comes in the last node
     */

//THIS IS BASICALLY CREATING A  LINKED LIST FROM SCRATCH>>

public class LinkedList {

    public static class Node { //defining a node class in a linked list
        int data; //the class Node will have data
        Node next; //as the next is a reference variable and points to another node so it is a type of the class that it is in

        public Node(int data){ //contrictor (object)
            this.data = data;
            this.next = null; //initially null
        }
    }
    //they are static , meaning they can be used across all instances of linkedList
    public static Node head; 
    public static Node tail;

    public void printList(){

        Node current = head; //start from the head node
        while(current != null){ //travese until the end of the ll
            System.out.print(current.data + " -> ");
            current = current.next; //move to the next node after printing one node
        }
        System.out.println("null"); //indicate the end of the List

    }

    //no need to make it static as it is a method and it can be used in any static function
    public void addFirst(int data){ //add a new node before the present head
        
        //create a new node.
        Node newNode = new Node(data);
        //case for when the linkedList is empty > tht means the head is null
        if(head == null){
            head = tail = newNode; //make the new node as the head and the tail both
        }
        //newNode next = head //that is link the new Node with the prvsly present head
        newNode.next = head;
        //make the head as the newNode>
        head = newNode;
    }

    //add last element means create a node and put it after the tail and make the new node as the tail
    public void addLast(int data){
        
        Node newNode = new Node(data); //make the new node
        //if the ll is empty initially then we make the new node as the tail and the head both>
        if(head == null){
            head = tail = newNode;
            return;
        }
        //make the tail wala next point to the new node
        tail.next = newNode;
        //make the new Node as the tail>
        tail = newNode;

    }

    public static void main(String[] args) {
        
        LinkedList ll = new LinkedList();
        /* 
        ll.head = new Node(1); //head p data store korlam 1  (head -> [1 | null])
        ll.head.next = new Node(2); //head er porer node ta tey data store korlam 2  (head -> [1 | *] -> [2 | null])
        */
        ll.addFirst(2); //initially the ll was empty so when we add the 1 data in a new node then it becomes the head and tail both
        ll.addFirst(1); //now when we add the another node then it makes it a new node and then the next value points to the head and then the head becomes the new node with data 2 and the reference variable as the address of the next ll that is with data 1
        ll.addLast(3);
        ll.addLast(4);
        ll.printList();
    }
}
