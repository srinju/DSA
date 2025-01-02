package Strings;

public class removeAdjacentDuplicates {
    public String removeDuplicates(String s) {
        //make a string builder
        //run a for loop throgh the charecters in the string
        //if the current charecter is equal to the last charecter in the string builder 
        //then remove the last charecter from the string builder
        //else append the current charecter
        //return the string builder after converting it to string
        //also ensure that the string builder length is greater than 0
        int n = s.length();
        StringBuilder sb = new StringBuilder(); //make a new string builder
        for(int i = 0 ; i < n ; i++) { //traverse through the string
            if(sb.length() > 0 && s.charAt(i) == sb.charAt(sb.length()-1)){ //ensuring sb length is > 0 and also if the last char is eq to the present in string then 
            sb.deleteCharAt(sb.length()-1); //delete the last char in the string builder
            } else {
                sb.append(s.charAt(i)); //if not then append the current char to the str builder
            }
        }
        return sb.toString(); //return the str builder after converting to string
    }
}
