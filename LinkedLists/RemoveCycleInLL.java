package LinkedLists;

public class RemoveCycleInLL {
    
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

    public static boolean isCycle() {

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                System.out.println("cycle");
                return true;
            }

        }

        System.out.println("not a cycle");
        return false;

    }

    public static void removeCycle() {

        //we have to find the last node of the ll
        //and point the ll to null rather than pointing to another node

        //now we will run the slow and head as +1 and +2 respectively
        //when the slow = fast then move the slow to the head of the ll
        //and move both slow and fast as +1
        //now mathemetically they will again meet at the cycle creation point that is when the last node points to the middle Node of the ll
        //and see the last node is the previous of the first ...(after the slow == fast)
        //take a copy and pen and visualise it 

        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast != null && fast.next != null){

            slow = slow.next; //+1
            fast = fast.next.next; // +2

            if(slow == fast){ //cycle detected
                cycle = true;
                break;
            }

        }

        if(cycle == false){
            return;
        }

        //make slow as head
        slow = head;
        //make the head as +1
        
        //make another node for keeping track of prev of fast
        Node prev = null; //intially null
        //run loop until the  slow == head
        while(slow != fast){
            //when they meet then the prev node is the last node 
            //prev = fast and fast moves by 1
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        //loop breaks when slow == head ... and now prev is the last node
        //we make the last node point to null that breaks the cycle of the ll
        prev.next = null;

    }

    public static void main(String[] args) {
        
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;

        System.out.println("before removing cycle : ");
        isCycle();
    
        removeCycle();

        System.out.println("after removing cycle");
        isCycle();

    }
}
