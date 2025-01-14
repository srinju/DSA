package LinkedLists;

public class ReverseBetweenLinkeList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(head == null || head.next == null){
            return head;
        }
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head; //dummy node points to the head

        ListNode leftPre = dummy; //pointer for the Node before reversing
        ListNode current = head;

        //travel to the left>
        for(int i=0 ; i < left-1 ; i++){
            //for 0 to l-1 we increment both our node pointers
            leftPre = leftPre.next;
            current = current.next;
        }

        //now we make prevNode as null and perform the reverse ll operation from l to r
        ListNode prev = null;
        ListNode subListHead = current;

        for(int i = 0 ; i <= right - left ; i++){
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        //final changes is to make the reversed parts connect
        //that is  now the preNode is the head of the new sub ll so we need to connect the leftPre with the prev
        //and also we have to connect the subList head with the currentNode , which is next to the prevNode
        leftPre.next = prev;
        subListHead.next = current;

        return dummy.next;
        
    }
}
