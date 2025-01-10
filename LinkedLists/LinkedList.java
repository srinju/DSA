package LinkedLists;
    
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
    public static int size; //by default java initialises it to 0

    public void printList(){

        if(head==null){
            System.out.println("linked List is empty");
        }
        Node current = head; //start from the head node
        while(current != null){ //travese until the end of the ll
            System.out.print(current.data + " -> ");
            current = current.next; //move to the next node after printing one node
        }
        System.out.println("null"); //indicate the end of the List

    }

    //no need to make it static as it is a method and it can be used in any static function
    public void addFirst(int data){ //add a new node before the present head O(1)
        
        //create a new node.
        Node newNode = new Node(data);
        size++; //increase the size whenevr new node is created
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
    public void addLast(int data){ //O(1)
        
        Node newNode = new Node(data); //make the new node
        size++;
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

    public void addInMiddle(int data,int idx){

        if(idx == 0){ //if the user wants the ll to add to the head
            addFirst(data); //we call the addFirst method that's what it does
        }

        Node current = head; //cuurent node as head
        int i = 0;

        while(i < idx-1){ //we want to go the previous index of the idx so that we create the node there and make the node at that place and assign the next of the prev to the new node and the new node's next to the idx2(prev) node
            current = current.next; //make the current to the next node
            i++;
        }
        //when we reach that that idx-1 place the while ends and the current node is the prev node>
        //make the new Node>
        Node newNode = new Node(data);
        size++;
        //make the next of the new node to the next node>
        newNode.next = current.next; //we make the newNode's next as the next of current node as the cuurent node is still connected to the idx wala node
        //make the idx-1 node's next as the new node
        current.next = newNode; 
       
    }

    public void  removeFirst(){

        if(size == 0){
            System.out.println("cannot remove any node as the linked list is empty");
        } else if(size == 1){
            head = tail = null;
            size = 0;
        }
        //we make the head as the head.next
        //and java's garbage collector automatically deletes the first node
        head = head.next; //make the next node from the head as the next head
        size--;

    }

    public void removeLast() {

        //tail ka prev wala next ko null kar do
        //and the prev will be  = tail
        //and hence java handles it that is the unhinged node gets deleted by the garbage collector

        if(size == 0){
            System.out.println("linked list is empty");
        } else if(size == 1){
            tail = head = null;
            size = 0;
        }

        //prev node ==> i = size - 2 (as the tail is size -1 index , therefore the prev of tail is that)
        Node prev = head; //initialise the previous node to the head node
        for(int i = 0 ; i < size-2 ; i++){
            prev = prev.next;
        }
        //so when the loop ends we reach the prev node of the tail
        prev.next = null; //make the refernce var to null
        tail = prev; //make thre prev as the new tail
        size--;

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

        ll.addInMiddle(7, 2);
        //ll.removeFirst(); // 2 -> 7 -> 3 -> 4 -> null
        System.out.println("before deleting last node :  ");
        ll.printList();
        System.out.println("size : " + ll.size);
        System.out.println("after deleting last node : ");
        ll.removeLast();
        ll.printList();
        System.out.println("the size of the linked list is : " + ll.size);
    }
}
