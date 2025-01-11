package LinkedLists;

public class FIndAndRemoveNthNodeFromEnd {
    
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
            
        }
        
        tail.next = newNode;
        tail = newNode;

    }

    public void printList() {

        if(head == null){
            System.out.println("empty linked list");
        }
        Node current = head;

        while(current != null){  
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");

    }

    public void reverseLinkedList(){

        Node current = head;
        Node prev = null;

        while(current != null){
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;

    }

    public void RemoveNthFromEndAnotherApproach(int N){ //dont follow very inefficient

        //in this apporach we first reverse the linked list and then travel from the head

        reverseLinkedList();
        Node prev = head;
        int i = 1;

        while(i < N-1){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        size--;
        reverseLinkedList();
        
    }

   
    public void RemoveNthFromEnd(int N){

        //here we will be given a N that is the N from the last that is the tail
        //we have to find where is it there and remove it from that location

        //we can also do like reverse the linked list and then reach the Nth index then
        //the Nth will be the current and then we link the prev with the next and the curren is taken by the garbage collector

        //another appoarch is >
        //if we see that the nth index is size-3 from the end
        //whereas from the start it is  size-3+1 , i.e (size-N+1)

        /*
         TO CALCULATE SIZE WE CAN DO THIS>
         int size = 0;
         Node current = head;
         while(current!=null){
            current = current.next;
            size++;
         }
        */

        //if the head is the N means from the end that is equal to the size only (head's location)>
        if(N == size){
        head = head.next; //head k head er next baniye dao tale link bhenge jave
        return;
        }

        //so we reach to the size-N index from the start
        Node prev = head;
        int i = 1; //we are starting from the i = 1 as we are assigning the prev as head and we are also checking if the N is the head or not so we iterate from i = 1
        
        while(i < size - N){ //we reach to the prev node of the node that has to be deleted that is at size - N + 1
            prev = prev.next;
            i++;
        }
        //when the loop ends that means i is at size-N therefore prev is at thazt idx
        //we link the connection with prev with the next ka next of prev
        prev.next = prev.next.next;
        size--; //decrement the size
        //and the size-N+1th index Node gets deleted by the garbage collector

    }
    

    public static void main(String[] args) {
        
        FIndAndRemoveNthNodeFromEnd ll = new FIndAndRemoveNthNodeFromEnd();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        
        System.out.println("before any operation : ");
        ll.printList();
        System.out.println("the size of the ll is : " + ll.size);

        int N = 3;
        System.out.println("after deleting " + N + "th Node from the end");
        ll.RemoveNthFromEnd(N);
        ll.printList();
        System.out.println("the size is : " + ll.size);
        /* 
        System.out.println("remove Nth from end using another apporach >");
        ll.RemoveNthFromEndAnotherApproach(N);
        ll.printList();
        */
    }
}
