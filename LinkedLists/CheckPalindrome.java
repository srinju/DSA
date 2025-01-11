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

    public boolean checkPalindromeOptimised(){ //here we will not use any external data structure and use space complexity of O(1)

        //we find the midNode
            //for midnode>
            //for even the midNode is none mid is between n/2-1 and n/2 indexes
            //for odd the midNode is n/2
        //then we reverse the 2nd half
        //then we check if the 1st fals is equal to the 2nd half or not . if yes then palindrome else not

        //finding midNode
        int secondHalfIndex ; int firstHalfLastIndfex;
        if(size % 2 == 0){ //even
            secondHalfIndex = size/2;
            firstHalfLastIndfex = (size/2) - 1;   
        } else { //odd
            secondHalfIndex = (int) Math.floor(size/2) + 1;
            firstHalfLastIndfex = (int) Math.floor(size/2) - 1;
        }

    }

    public static void main(String[] args) {
        
        CheckPalindrome ll = new CheckPalindrome();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        ll.printList();

        if(ll.checkPalindrome()){
            System.out.println("linked list is a palindrome");
        } else {
            System.out.println("linked list is not a palindrome");
        }
    }
}
