package LinkedLists;

public class ZigZagLinkedList {
    
    //PROBLEM STATEMENT >>

    //For a linked List of the form : L(1) -> L2 -> L3 -> L4 -> L(n-1) -> L(n)
    //convert it into a zig-zag form i.e> l1 -> l(n) -> l(2) -> L(n-1) -> l3 -> L(n-2)

    //eg : >
    //[1,2,3,4,5] --> [1,5,2,4,3]

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
            return;
        }

        tail.next = newNode;
        tail = newNode;

    }

    public void printList() {

        Node current = head;

        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");

    }

    public  Node ZigZag(Node head) {

        //find Mid>
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //the slow Node is the midNode
        Node midNode = slow;
        //rightNode is midNode.next
        Node rightNode = midNode.next;
        //break the linkedList>
        midNode.next = null;
        //reverse the second half
        //current is the rightNode
        //previous is the null
        Node prev = null;
        //reverse>
        while(rightNode != null){
            Node next = rightNode.next;
            rightNode.next = prev;
            prev = rightNode;
            rightNode = next;
        }
        //rightSideHead is now the prev
        Node rightHead = prev; //and eta diyei exchange add korte hbe kron eta hcche reverse korar ageyr tail
        //LeftHead is the head
        Node leftHead = head;
        //take two pointers
        //Node LeftCounter = leftHead;
        //Node rightCounter  = rightHead;

        Node finalLinkedList = new Node(-1); //dummy node add kore dao akta
        //pointer for final Linked List>
        Node temp = finalLinkedList; //point to head

        while(leftHead != null && rightHead != null){
           temp.next = leftHead;
           temp = temp.next; //increment final ll counter
           leftHead = leftHead.next; //increment the leftHead counter

           temp.next = rightHead;
           temp = temp.next; //increment final ll counter
           rightHead = rightHead.next; //increment the rightHead counter
        }

        //add remaining nodes if any>
        while(leftHead != null){
            temp.next = leftHead;
            temp = temp.next;
            leftHead = leftHead.next;
        }
        
        while(rightHead != null){
            temp.next = rightHead;
            temp = temp.next;
            rightHead = rightHead.next;
        }

        return finalLinkedList.next;

    }

    public static void main(String[] args) {
        
        ZigZagLinkedList ll = new ZigZagLinkedList();

        ll.addLast(7);
        ll.addLast(8);
        ll.addLast(1);
        ll.addLast(9);
        ll.addLast(0);

        ll.printList();

        ll.head = ll.ZigZag(ll.head);
        ll.printList();
    }
}
