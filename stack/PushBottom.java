package stack;
import java.util.*;
public class PushBottom {
    
    //already stack present with elements
    //we need to push element at the bottom of the stack rather than the bottom of the stack

    //APPROACH>

    //we will first remove the elements and wehen the stack becomes empty we push our element at bottom
    //and then add the removed elements in order

    public static void pushAtBottom(Stack<Integer> s , int data){
        
        //base case
        if(s.isEmpty()){ //when stack is empty we push the data
            s.push(data);
            return;
        }
        //store top that is removed do the recursion step and finally add it 
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);

    }

    public static void main(String[] args) {
        
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s, 4);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
