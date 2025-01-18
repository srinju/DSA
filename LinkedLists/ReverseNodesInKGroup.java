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

        //base case >>
        if(head == null){
            return null;
        }
        
        //checking if a current group has k elements or not
        Node temp = head ; 
        int count = 0 ;

        while(temp != null && count < k){
            temp = temp.next;
            count++;
        }

        if(count < k){
            return head;
        }

        //perform the first grp reverse 
        Node prev = null;
        Node current = head;
        count = 0 ;
        Node next = null;
        //perform the first group reverse >>

        while(current != null && count < k){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        //after the while loop ends it returns the prev as the head and the next as the head of the new group

        //recursively reverse the next LIst>

        if(next != null){
            //recursion call returns the newHead of the next reversed group >
            Node newHead = reverseInKGroup(next, k);
            head.next = newHead; //connect the head tht is the tail of the prev reversed group with the head of the newly reversed grp
        }

        //the prev is the newHead of the first group

        return prev;

        
    }

    public static void main(String[] args) {
        
        ReverseNodesInKGroup ll = new ReverseNodesInKGroup();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.printList();

        ll.head = ll.reverseInKGroup(ll.head, 2);

        ll.printList();
    }

}
