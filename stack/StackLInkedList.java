package stack;

public class StackLInkedList {
    
   static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

   }

   static class stack {

        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data){
            
            Node newNode = new Node(data);

            if(isEmpty()){
                head = newNode;  
                return;  
            }
            newNode = head.next;
            head = newNode;
        }

        public static int pop() {
            //remove the head
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;

        }

        public static int peek() {
            //returns the head of the stack>>
            if(isEmpty()){
                return -1;
            } 
            return head.data;
        }
   }
}
