package LinkedLists;

public class ReverseNodesInKGroup {
    
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

    public static Node reverseInKGroup(Node head , int k){

        //we can reverse the k size by us
        //and rest can be done by recursion
        //recurision gives us the head of the next reversed
        //we add our newTail with the reversed head and it is done

        
    }

}
