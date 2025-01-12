package LinkedLists;

public class DetectCycleInLL {
    
    //usually the tail points to a null
    //but sometimes lls have the tail pointed to the mid or any other node then it is a loop in a ll or a cyvle in a ll
    //for finding out the cycle in a ll we use floyd's cycle findgin algorithm

    //FLOYD'S CYCLE FINDING CYCLE ALGORITHM

    //two pointers slow and fast slow - > +1 and fast -> +2
    //slow and fast init at head
    //one thing we noticed is >
    //when both pointer at same that is at 0 moves -> distance is 0 btw them
    //1 move 1 distance
    //2 move 2 distance and 3 moves 3 distance btw them
    //so if we continute this slow fast moving
    //we see that at some point later the slow and fast pointers meety
    //that means a lopop
    //if they dont meet then there is no loop in a ll

    //if we analyse it more mathematically then we can say
    //if slow and fast are at the same point then at the distance is 0 but also d
    //d is the distance of the whole loop
    //bara ak side theeke tui pase pase but arak side theke toh tu d distance agey paser mal er theke tai jonnei tui pase achis maal er

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

    public static boolean isCycle(){
        
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; // +2
            if(slow == fast){ //cycle
                System.out.println("cycle is there!!");
                return true;
            }
        }
        System.out.println("no cycle is there");
        return false;

    }

    public static void main(String[] args) {

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;

        isCycle();
        
    }
}
