package Strings;

public class StringCompression {
   
    public static String compressString(String str){
        int n = str.length();
        StringBuilder sb = new StringBuilder(); //make a string 
        for(int i = 0 ; i < n ; i++){
            Integer count = 1; //init the count
            while(i < n - 1 && str.charAt(i) == str.charAt(i+1)){ //when the element same
                count++; //increase the count
                i++; //increase the pointer forward so that count loop runs
            }
            sb.append(str.charAt(i)); //append the i and if the count if greater for that i then append the count too
            if(count > 1){
                sb.append(count.toString());
            }
        }
        return sb.toString(); //return as a string
    }
    public static void main(String[] args) {
        String str = "aaabbccddd";
        System.out.println("the compressed string is  : " + compressString(str));
    }
}