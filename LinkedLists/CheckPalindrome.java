package LinkedLists;

import java.util.ArrayList;

public class CheckPalindrome {
    
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

    public void addLast(int data){

        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            
        }
        
        tail.next = newNode;
        tail = newNode;

    }

    public void printList() {

        if(head == null){
            System.out.println("empty linked list");
        }
        Node current = head;

        while(current != null){  
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");

    }

    public boolean checkPalindrome() { //THIS TAKES O(n) tc and sc of O(n) TOO AS WE ARE USING ANOTHER DATA STRUCTURE

        //we can make an array list and store each data of node in the ll in that arrayList
        //and check if that arrayList is palindrome or not

        ArrayList<Integer> al = new ArrayList<>();
        Node current = head;

        while(current != null){
            al.add(current.data);
            current = current.next;
        }
        //check arrlist palindrome or not>
        int i = 0;
        int j = al.size()-1;
        while(i < j){
            if(!(al.get(i) == al.get(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }

    public Node findMid(Node head){

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //mid node

    } 

    public boolean checkPalindromeOptimised(){ //here we will not use any external data structure and use space complexity of O(1)

        //we find the midNode
            //for midnode>
            //for even the midNode is none mid is between n/2-1 and n/2 indexes
            //for odd the midNode is n/2
        //then we reverse the 2nd half
        //then we check if the 1st fals is equal to the 2nd half or not . if yes then palindrome else not

        //FINDING MID >  

        //here we use slow fast technique .
        //the slow pointer goes +1
        //the fast pointer goes +2
        
        //for even > 
        //if we see then when fast = null then slow is at mid(size/2)
        //for odd >
        //if we see then when fast = size-1 index or where fast.next = null (that is the tall) then slow is at mid
        //i made a findMid function for it.

        //REVERSE THE SECOND HALF

        //so after reverse it would look like something like >
        // 1 -> 2 <- 2 <- 1
        //      |
        //     null

        if(head == null || head.next == null){ //if ll is empty or single element then it is palindrome
            return true;
        }

        //find mid>
        Node midNode = findMid(head);

        //reverse second half>
        Node prev = null;
        Node curr = midNode;
        while(curr != null){
            Node next;
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //right half ka head is the new prev
        Node right = prev;
        Node left = head; //left half ka head

        //check both half are same or not >
        while(right != null){ //right not equal to null coz the 
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;

        }
        return true;

    }

    public static void main(String[] args) {
        
        CheckPalindrome ll = new CheckPalindrome();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        ll.printList();

        if(ll.checkPalindromeOptimised()){
            System.out.println("linked list is a palindrome");
        } else {
            System.out.println("linked list is not a palindrome");
        }
    }
}
