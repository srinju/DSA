package LinkedLists;


public class AddTwoNumbers {
    
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy  = new ListNode(-1);
        ListNode current = dummy;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            int sum = val1 + val2 + carry;
            carry = sum / 10; //carry for the next digit
            int digit = sum % 10; //current digit

            //add the new digit to the result list >

            current.next = new ListNode(digit);
            current = current.next;

            //move to the next nodes>
            if(l1 != null) l1 = l1.next;
            if(l2 != null)  l2 = l2.next;
        }

        return dummy.next;
    }
}
