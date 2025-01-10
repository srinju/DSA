package LinkedLists;

public class RecursiveSearch { //assume it as a linked List class
    
    public static class Node {
        
        int data;
        Node next;

        public  Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addLast(int data){

        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;

    }

    public int recursiveSearch(int key , Node head , int i) {

        //we init a temp node to head
        //and search for the rest of the ll except the head
        //base case is if the head return the key then return the index of the head
        //if head = null that means enire search is complete i.e return -1

        //base case>
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return i;
        }

        Node nextHead = head.next;

        return recursiveSearch(key, nextHead, i+1);

    }

    public void printList(){

        if(head == null){
            System.out.println("linked list is empty!!");
        }
        Node current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {

        RecursiveSearch ll = new RecursiveSearch();
        ll.addLast(7);
        ll.addLast(2);
        ll.addLast(11);
        ll.addLast(13);
        ll.addLast(77);
        ll.printList();
        System.out.println(ll.recursiveSearch(77, head, 0));
    }
}
