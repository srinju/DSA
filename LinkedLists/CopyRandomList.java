package LinkedLists;

public class CopyRandomList {

    class Node {
        int val;
        Node next;
        Node random;
    
        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        //what we do is>
        //we insert the copies of the node in the middle (that is in that node itself)
        //and we link those randoms with the randoms of the original list
        //and now seperate the copy and return it

        //base case>
        if(head == null ){
            return head;
        }

        //copy the ll >
        Node current  = head;
        while(current != null){
            Node newNode = new Node(current.val); //make the new node beside it with their value
            newNode.next = current.next; //connect the newNode with the next node of the current node(og)
            current.next  = newNode; //connnect the current with the newNode
            current = newNode.next; //increment the pointer
        }

        //copy the random pointers>

        current = head;
        while(current != null){
            if(current.random != null){
                current.next.random = current.random.next;
            }
            current = current.next.next;       
        }

        //now after copy we have to separate the copy with the og>

        current = head;
        Node newHead = head.next;
        Node newCurrent = newHead;

        while(current != null){
            current.next = newCurrent.next;
            current = current.next;
            if(current != null){
                newCurrent.next = current.next;
                newCurrent = newCurrent.next;
            }
        }

        return newHead;
    }

}
