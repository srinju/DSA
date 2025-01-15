package LinkedLists;

public class mergeTwoLL {

    public static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public  Node head;
    public  Node tail;
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
    
    public static   Node merge(Node head1 , Node head2){
        
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        
        Node current1 = head1;
        Node current2 = head2;
        
        while(current1 != null && current2 != null){
            
            if(current1.data <= current2.data){
                //current 1 is smaller>
                //apppend the current 1 to the megedLL
                temp.next = current1;
                temp = temp.next;
                current1 = current1.next;
            } else {
                //current2 is smaller then appebd the current 2 node in the mergedLL
                temp.next = current2;
                temp = temp.next;
                current2 = current2.next;
            }
        }
        
        //check and add the remaining elements>
        while(current1 != null){
            temp.next = current1;
            temp = temp.next;
            current1 = current1.next;
        }
        
        while(current2 != null){
            temp.next = current2;
            temp = temp.next;
            current2 = current2.next;
        }
        
        return mergedLL.next;
        
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        mergeTwoLL ll1 = new mergeTwoLL();
        mergeTwoLL ll2 = new mergeTwoLL();

        ll1.addLast(1);
        ll1.addLast(3);
        ll1.addLast(7);

        ll2.addLast(1);
        ll2.addLast(2);

        Node mergedHead = merge(ll1.head, ll2.head);
        mergeTwoLL mergedList = new mergeTwoLL();
        mergedList.head = mergedHead;
        mergedList.printList();
        
    }
}
