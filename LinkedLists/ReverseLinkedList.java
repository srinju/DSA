package LinkedLists;

public class ReverseLinkedList {
    
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

    public void reverseLinkedList(){ //O(n)

        Node prev = null; //initially the prev node is head ka agey wala that is null
        Node current = tail = head; //current is the head
        //run a loop jab tak cuurent is null
        while(current != null){
            Node next = current.next; //next is the node next to the current
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;

    }

    public static void main(String[] args) {
        ReverseLinkedList ll = new ReverseLinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.printList();
        ll.reverseLinkedList();
        ll.printList();
    }
}
