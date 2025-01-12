package LinkedLists;

public class CountLoopLength {
    
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

        Node current = head;

        while(current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");

    }

    public static int Solve(Node head) {
        
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        
        if(head == null || head.next == null){
            return -1;
        }
        //check cycle or not
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return size - 1; //question was to return size -1
            }
        }
        //no cycle exists>
        return -1;
    }

    public static void main(String[] args) {

        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;

        System.out.println(Solve(head));

    }
}
