package LinkedLists;

public class MergeSort { //O(nlogn)
    
    //find middle of the linkedList
        //for odd size mid is one clearly --> first half e kintu middle thakbe as first half er last Node
        //for even size mid can be two . but we take the first Half ka last node as the middle
        //for making sure we get the midNode we can find the mid by slow and fast approach ut starting the head with head.next then only when fast.next = null then slow wil be the mid that is the last Node of the first part
        //we can do the native approach too but that will give the mid as the firstNode of the second half of the ll (which we dont want to happen)
    //divide the ll into two parts --> left half and the right hald
        //we make the mid.next = null . then only the ll divides into two parts
        //right head is mid.next
        //mid.next = null (break the ll into two parts after definging the secondHalf head)
    //then we call mergeSort for both of the parts
        //mergeSort(leftHead) //for firt Half
        //mergeSort(rightHead) // for the right half
    //then we merge both the parts
        //make a temp ll as mergeLL with a dummy Node -1 which will be deleted later
        //compare leftHead to rightHEad .
        //add the smallest one (smallest one selected half er pointer koro increment)
        //and also increment the temp node pointer
        //finalHead = mergeLL.next (because initially -1 was the head) i.e -1 Node gets deleted

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

    public Node mergeSort(Node head){

        //base case >
        if(head == null || head.next == null){
            return head;
        }
        //find mid of the ll>
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

        }
        //slow is the mid
        Node midNode = slow;
        Node rightHead = midNode.next; //right head is mid ka next wala part
        Node leftHead = head;
        //head is the firtstHalf head
        midNode.next = null; //break the chain

        //call merge sort for both of the parts >
        //the ,ergeSort of the left and right part gives a new head
        Node newLeftHead = mergeSort(leftHead);
        Node newRightHead = mergeSort(rightHead);

        //merge both of the parts>
        Node mergedLL = new Node(-1); //dummy node with -1 which will be deleted later
        Node temp = mergedLL; //init the temp Node pointer to the dummy Node which is the current Head

        while(newLeftHead != null && newRightHead != null){

            if(newLeftHead.data <= newRightHead.data){

                temp.next = newLeftHead;
                newLeftHead = newLeftHead.next;
                temp = temp.next;

            } else { //right head smaller

                temp.next = newRightHead;
                newRightHead = newRightHead.next;
                temp = temp.next;

            }
        }

        //for remaining>
        while(newLeftHead != null){

            temp.next = newLeftHead;
            newLeftHead = newLeftHead.next;
            temp = temp.next;

        }

        while(newRightHead != null){

            temp.next = newRightHead;
            newRightHead = newRightHead.next;
            temp = temp.next;

        }

        return mergedLL.next; //.next as the first one is the -1
    }

    public static void main(String[] args) {
        
        MergeSort ll = new MergeSort();

        ll.addLast(5);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(7);
        ll.addLast(0);
        ll.addLast(1);

        ll.printList();
        ll.head = ll.mergeSort(ll.head);
        ll.printList();

    }
}
