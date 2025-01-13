package LinkedLists;

public class SepareteEvenAndOdd {
    
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

    public Node reArrange(Node head){

        if(head == null){
            return head;
        }

        //what we will do is we will make two linked lists
        //when the current.data is even then add to the even one else add to the odd one
        //and after that we combine both of the lls
        //basically connecting the tail of the even with the head of the odd

        Node current = head;
        Node even = new Node(-1);
        Node tempEven = even; /// pointer for evern node
        Node odd = new Node(-1);
        Node tempOdd = odd; //pointer for odd node

        while(current != null){
            if(current.data %2 == 0){
                //even node
                tempEven.next = current; //add the current to the even ll
                tempEven = tempEven.next; //increment the even pointer
                current = current.next;
            } else {
                //odd node
                tempOdd.next = current;
                tempOdd = tempOdd.next;
                current = current.next;
            }
        }

        //combine both of the linked lists>
        tempEven.next = odd.next; //join the tail of the even list with the head of the odd list --> odd list is -1 ka baad wala
        tempOdd.next = null; //point the odd tail to null --> therefore mkaing it a tail for the entire node

        return even.next; //return the whole ll -->  now all lls are joined with the even

    }

    public static void main(String[] args) {
        
        SepareteEvenAndOdd ll = new SepareteEvenAndOdd();

        ll.addLast(2);
        ll.addLast(1);
        ll.addLast(4);
        ll.addLast(3);

        ll.printList();

        ll.head = ll.reArrange(ll.head);
        ll.printList();
    }
}
