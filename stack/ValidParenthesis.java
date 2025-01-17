package stack;

import java.util.Stack;

public class ValidParenthesis {
    
    /*

    Given a string s containing just the characters '(', ')', '{', '}', '[', and ']', determine if the input string is valid.

    An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.

     */

    //APPROACH >>\

    //we will push the opening brackets in a stack and whenever a closing bracket appears
    //we will first chekck if the top ofthe stack is that one's opening or not.
    //if yes then pop that head and move to the next ONe.  if no then it is not valid we know straight away
    //and after whole operation at last also we check if the stack is empty or not
    //if it is not empty then there is one opening bracket left there .
    //that would mean the combination of parenthesis is not valid
    

    public static boolean isValidParenthesis(String str){

        Stack<Character> s = new Stack<>();

        for(int i = 0 ; i < str.length() ; i++){
            char current = str.charAt(i); //current charecter stored
            
            if(current == '(' || current == '{' || current == '['){
                //opening characters>>
                s.push(current); //push the opening charecters
            } else { //closihg brackets come
                //check first taht the closing came and check for s is empty or not
                if(s.isEmpty()){
                    return false;
                }
                //else check for pair form >
                if(    (s.peek() == '(' && current == ')')
                    || (s.peek() == '{' && current == '}')
                    || (s.peek() == '[' && current == ']')   ){

                        s.pop(); //if valid then pop the top

                } else {
                    return false;
                }
            }
            
        }

        //after the whole operation we will check if the stack is empty then we will return true else we will return false
        if(s.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        
        String str = "({})[]"; //true
        System.out.println(isValidParenthesis(str));
        
    }
}
