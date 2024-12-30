package Strings;

public class ConverToUpperCase {
    //there is a string we have to convert it into upper case
    //we take the str as input
    // we make a str builder and travel through the string and append spaces as it is in the str builder and convert the lower cases to uppercases

    public static String toUpperCase(String str){
        int n = str.length();
        StringBuilder sb = new StringBuilder(); //we make a str builder
        //we make the first letter to String
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch); //append the first converted letter to sb
        for(int i = 1 ; i < n ; i++){
            if(str.charAt(i) == ' ' && i < n-1){
                sb.append(str.charAt(i)); //append  that space 
                i++;// increment the pointer
                sb.append(Character.toUpperCase(str.charAt(i))); //and append the converted letters to the sb
            } else {
                sb.append(Character.toUpperCase(str.charAt(i))); //if no space then just convert and go ahead
            }
        }
        return sb.toString(); //convert the string builder to string and return the value
    }
    public static void main(String[] args) {
        String str = " my name is srinjoy das ";
        System.out.println("the converted string to uppercases is  : " + toUpperCase(str));
    }
}
