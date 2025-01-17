package stack;
import java.util.*;
public class ReverseStringUsingStackl {
    

    //reverse a strig using stack >>

    // insert each charecter of the string in the stack
    //and pop it , all the elements will get popped in reversse
    
    public static String reverse(String str) {
        
        Stack<Character> s = new Stack<>();

        int i = 0;
        //push all the charecters in the strring>>
        while(i < str.length()){
            s.push(str.charAt(i));
            i++;
        }
        //now pop out to a stringBuilder>>
        StringBuilder sb = new StringBuilder("");
        while (!s.isEmpty()) {
            sb.append(s.pop());
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println(reverse(str));
    }
}
