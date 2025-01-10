package LinkedLists;

public class LinearSearch { //assume this is a Linked List class
    
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

    public int searchKey(int key){ //Linear Search O(n)

        //we make a node assign it with the head
        //we run a loop until the node becomes null
        //and check insidfe the loop that whether that node.data = key

        int i = 0;
        Node current = head; //make a node init to head
        while(current != null){
            if(current.data == key){
                return i;
            }
            i++;
            current = current.next;
        }
        //key not found>
        System.out.println("key not found");
        return -1;

    }

    public static void main(String[] args) {
        
        LinearSearch ll = new LinearSearch(); //LinearSearch is nothing but the LinkedList name pls assume
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.printList();
        System.out.println(ll.searchKey(6));
    }

}
