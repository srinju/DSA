package LinkedLists;

public class arrangeOddAndEvenIdx {
    
    //what we have to do is print the ll with all the odd indices together and all the even indices together

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
    public  int size;
    
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

    public Node reArrange(Node head){

        if(head == null || head.next == null){
            return head;
        }

        Node oddNode = head;
        Node evenNode = head.next;
        Node evenHead = evenNode;

        while(evenNode != null && evenNode.next != null){
            //assembel odd indices>
            oddNode.next = evenNode.next;
            oddNode = oddNode.next;

            //assemble even indices>
            evenNode.next = oddNode.next;
            evenNode = evenNode.next;
        }

        //connect to the oddNodes witht the evenNodes indices>
        oddNode.next = evenHead;

        return head;
    }

    public static void main(String[] args) {
        
        arrangeOddAndEvenIdx ll = new arrangeOddAndEvenIdx();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.printList();

        ll.head = ll.reArrange(ll.head);

        ll.printList();
    }

}
