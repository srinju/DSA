package LinkedLists;

public class SortBiotonicLL {
    
    public static class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        public Node(T data){
            this.data = data;
            this.next  = null;
            this.prev = null;
        }

    }

    public static Node<Integer> head;
    public static Node<Integer> tail;
    public static int size;

    public void addLast(int data){

        Node<Integer> newNode = new Node<>(data);
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

        Node<Integer> current  = head;

        while(current != null){
            System.out.print(current.data + "<->");
            current = current.next;
        }
        System.out.println("null");

    }


    public static Node<Integer> sortDLL(Node<Integer> head) {
        // Write your code here.
        //base case>
        if(head == null || head.next == null){
            return head;
        }
        //find peak >
        Node<Integer> current = head;
        Node<Integer> peak = null;

        while(current != null && current.next != null){
            if(current.next.data < current.data){
                peak = current;
                break;
            }
            current = current.next;
        }
        //if peak == null that means list is already sorted in ascending order>
        if(peak == null){
            return head;
        }
        //we get the peak Node
        //we divide the ll into two parts from the peak
        //Node<Integer> tailLeft = peak.prev;
        Node<Integer> headRight = peak.next;
        //break the dll into two parts >
        peak.next = null;
        if(headRight != null){
            headRight.prev = null;
        }

        //now reverse the second half of the dll to make the merging easier >
        Node<Integer> previous = null;
        Node<Integer> currentNode = headRight;

        while(currentNode != null){
            Node<Integer> nextWalaNode = currentNode.next;
            currentNode.next = previous;
            currentNode.prev = nextWalaNode;
            previous = currentNode;
            currentNode = nextWalaNode;
        }
        
        headRight = previous;
        
        Node<Integer> mergedList = new Node<>(-1); //make a merged dll with a dummy node -1
        Node<Integer> temp = mergedList; //pointer for the mergedList

        //now we compare both the parts and put the smallest node in the resulting ll
        //we have the tailLeft which is unnecessary , we can get the head of the left part
        //we have the rightHead .
        //we traverse the nodes on both the parts until both of the heads becomes null

        Node<Integer> headLeft = head;
        while(headLeft != null && headRight != null){
            if(headLeft.data <= headRight.data){
                temp.next = headLeft ; //put the smaller value in there
                headLeft.prev = temp;
                temp = temp.next; //update the merged ll pointer
                headLeft = headLeft.next; //update the leftHalf pointer
            } else {
                temp.next = headRight;
                headRight.prev = temp;
                temp = temp.next;
                headRight = headRight.next;
            }
        }

        //for remaining nodes>

        while(headLeft != null){
            temp.next = headLeft;
            headLeft.prev = temp;
            temp = temp.next;
            headLeft = headLeft.next;
        }

        while(headRight != null){
            temp.next = headRight;
            headRight.prev = temp;
            temp = temp.next;
            headRight = headRight.next;
        }
        mergedList.next.prev = null;
        return mergedList.next; //remove the dummy node -1 from the front

    }

    public static void main(String[] args) {
        
        SortBiotonicLL dll = new SortBiotonicLL();

        dll.addLast(1);
        dll.addLast(5);
        dll.addLast(8);
        dll.addLast(4);
        dll.addLast(2);
        dll.addLast(1);

        dll.printList();
        dll.head = dll.sortDLL(dll.head);
        dll.printList();
    }
}
