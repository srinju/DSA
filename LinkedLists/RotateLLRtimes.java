package LinkedLists;

public class RotateLLRtimes {

    public static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node head;
    public static Node tail;
    public static  int size;
    
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        
        if(head == null){
            head = tail = newNode;
            return;
        }
        
        tail.next = newNode;
        tail = newNode;
        
    }
    
    public void printList() {
        
        if(head == null){
            System.out.println("the linked list is empty!!");
            return;
        }
        
        Node current = head;
        
        while(current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
        
    }

    public static Node Rotate(Node head , int r){

        //APPROACH >

        //basically r times rotation is move the last r nodes from the end and attach it to the end
        // we travel to the size - k - 1 node that is the r node er ager ta
        //then we remove oi node er porer mal gulo k and add at first

        //base case>
        if(head == null){
            return head;
        }

        //handling k > size case >
        r = r % size;

        if(r== 0){ //the list stays the same
            return head;
        }

        //now we travel to the r node from the end er ager node tai>
        Node current = head;
        for(int i  = 0 ; i < size - r - 1 ; i++){
            current = current.next;
        } 

        //when tehy loop ends then the current
        //current node is the node at r node from end or ager node tai
        Node newHead = current.next; //newHead is the current.next obv
        current.next = null; //break  the chain

        //move the broken chain from the end to the beginning of the node>
        tail.next = head;

        return newHead;

    }

    public static void main(String[] args) {
        
        RotateLLRtimes ll = new RotateLLRtimes();

        ll.addLast(4);
        ll.addLast(7);
        ll.addLast(3);
        ll.addLast(1);
        ll.addLast(6);

        ll.printList();

        ll.head = Rotate(ll.head , 3);

        ll.printList();

    }
}
