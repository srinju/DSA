package LinkedLists;

public class DoubleLinkedList {
    
    public static class Node {

        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    public static Node head;
        public static Node tail;
        public static int size;

        public  void addFirst(int data) {
            
            Node newNode = new Node(data);
            size++;

            if(head == null){
                tail = head = newNode;
                return;
            }

            head.prev = newNode;
            newNode.next = head;
            head = newNode;

        }

        public void addLast(int data){

            Node newNode = new Node(data);
            size++;

            if(head == null){
                tail = head = newNode;
                return;
            }

            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;

        }

        public void removeFirst() {

            if(head == null) {
                System.out.println("empty ll");
                return;
            }

            head = head.next; //make the next node as the new head node
            head.prev = null;
            size--;

        }

        public void removeLast() {

            if(head == null){
                System.out.println("empty mf");
                return;
            }

            tail = tail.prev;
            tail.next = null;

        }

        public void printList() {

            Node current  = head;

            while(current != null){
                System.out.print(current.data + "<->");
                current = current.next;
            }
            System.out.println("null");

        }

        public static void main(String[] args) {
            
            DoubleLinkedList dll = new DoubleLinkedList();

            dll.addFirst(3);
            dll.addFirst(2);
            dll.addFirst(1);

            dll.printList();

            dll.addLast(4);
            dll.addLast(5);

            dll.printList();

            dll.removeFirst();
            dll.printList();

            dll.removeLast();
            dll.printList();
            
        }

    
}
