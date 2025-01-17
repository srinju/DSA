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

            newNode.next = head;
            head = newNode;
        }

        public static void pop() {
            //remove the head
            if(isEmpty()){
                System.out.println("stack is empty");
            }
            //make the head the head.next so the garbag3e collector takes away the head
            head = head.next;

        }

        public static int peek() {
            //returns the head of the stack>>
            if(isEmpty()){
                return -1;
            } 
            return head.data;
        }
   }

   public static void main(String[] args) {
        stack s = new stack();

        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
   }
}
