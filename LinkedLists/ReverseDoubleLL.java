package LinkedLists;

public class ReverseDoubleLL {
    
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

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

    public void printList() {

        Node current  = head;

        while(current != null){
            System.out.print(current.data + "<->");
            current = current.next;
        }
        System.out.println("null");

    }

    public void reverse() {

        Node prev = null;
        Node current = head;
        
        while(current != null){
            Node next = current.next; //next node is Next from current
            current.next = prev; //reverse it
            current.prev = next; //as two links pointing to the prev so make one of them to the next one

            prev = current; //update the position of prev to current
            current = next; //update the position of current to next
        }
        head = prev; //prev is the new head
    }

    public static void main(String[] args) {
        
        ReverseDoubleLL dll = new ReverseDoubleLL();

        dll.addLast(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(4);

        dll.printList();

        dll.reverse();

        dll.printList();
    }
}
