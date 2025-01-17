package stack;

import java.util.Stack;

public class ReverseStack {
    
    //we will pop all the elements until s.isempty
    //then we will push bottom the last top that was removed
    //that basically gives us the reversed form

    public static void pushBottom(Stack<Integer> s , int data){

        if(s.isEmpty()){
            s.push(data);
            return;
        }    

        int top = s.pop();
        pushBottom(s, data);
        s.push(top);

    }

    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    public static void reverseStack(Stack<Integer> s) {

        if(s.isEmpty()){
            return;
        }

        int top = s.pop();
        reverseStack(s);
        pushBottom(s, top);

    }

    public static void main(String[] args) {
        Stack<Integer>  s =  new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        reverseStack(s);

        printStack(s); //1  2  3
    }
}
