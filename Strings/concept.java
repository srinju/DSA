package Strings;

public class concept {
    public static void checkString(String str1 , String str2){
        if(str1 == str2){
            System.out.println("same");
        } else {
            System.out.println("not same");
        }
    }
    public static void main(String[] args) {
        String str1 = "me";
        String str2 = "me";
        String str3 = new String("me"); //called interning
        checkString(str1, str3);
        //str1 and str2 are same whereas str1 != str3 and str2 != str3
        //tony is a object of str1 and str2 , and when we declare a new string(tony) like that then we appoint another object to str 3 whereas str1 created tony and str 2 also points to that same object tony 
        //but str3 points to a completely different object tony
        //therefore str1 and str2 have the same address
    } 
}

