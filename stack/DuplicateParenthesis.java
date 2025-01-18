package stack;

import java.util.Stack;

public class DuplicateParenthesis {
    
    /*
    Given a balanced expression, find if it contains duplicate parentheses or not.
    A set of parentheses are duplicate if the same subexpression is surrounded by multiple parentheses.

    Return true if it contains duplicates, else return false.

    Example:

    (((a + (b))) + (c + d)) → true
    ((((a) + (b))) + c + d) → true
    ((a + b) + (c + d)) → false
    (((a + b)) + c) → true

    */

    //APPROACH >>

    //whenevr we get opening bracket or any operand or operator then we push in the stack
    //and whenevr a closing one comes then we have to check for opening pair 
    //while checking we will count the number of operand and operator
    //when we find the opening pair and we see count<1 then we return true that means duplicate found
    //if count > 1 that means operands exist then we return false that is  no duplicates found

    public static boolean isDuplicate(String str){

        Stack<Character> s  = new Stack<>();

        for(int i = 0 ; i < str.length() ; i++){
            char current = str.charAt(i);
            //closing check>
            //when closing found we will init a count and check until opening found
            if(current == ')') {
                int count = 0;
                while(s.peek() != '('){ //jotokhon amar stack e ( pacchina totokhn count increment and pop koro char gulo k
                    s.pop();
                    count++;
                }
                //found opening outside while loop>
                //check count>
                if(count < 1){
                    return true; //that is opening found but count is < 1 that is unncecesart opening so duplicate
                } else {
                    s.pop();
                }
            } else {
                //opening check>
                //opening asle push and also operators and operands push >
                s.push(current);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        
        String str1 = "((a+b))"; //duplicate --< true
        String str2 = "(a-b)"; //no duplicate -> false

        System.out.println(isDuplicate(str1));
        System.out.println(isDuplicate(str2));
    }

}
