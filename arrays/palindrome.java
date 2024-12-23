//to check if the string is palindrome or not
import java.util.*;
public class palindrome {
    public static boolean isPalindrome(String word){
        char[] charArray = word.toCharArray(); //convert the string to a mutalble string or sort of an array
        int start = 0;
        int end = word.length() - 1;
        while(start < end){
            if(charArray[start] != charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String word = sc.nextLine();
        if(isPalindrome(word)){
            System.out.println("the string is a palindromic string");
        } else {
            System.out.println("the string is not a palindromic string");
        }
        sc.close();
    }
}
