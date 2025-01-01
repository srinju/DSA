package Recursion;

public class PrintAllBinaryStringsWithoutConsecutineOnes {

    //PROBLEM STATEMENT >>>>>

    //print all binry strings of size N without consecutive ones
    //{0,1,0,0,1,1} --> not valid
    //{0,1,0,1,0,1} --> valid

    //APPROACH >>>>>

    //base case is n = 0 then empty string will be there
    //recent last place if 0 is there then we can put 0 and 1 anything
    //if recent last place have 1 there then we cant put 1 on the next place
    //we have to put 0 only
    //so if we take choice of putting in the nth place then the rest of the n-1 places can be handled by recursion
    //so the choice in nth place is 2 that is either 0 or 1
    //if lastplace is 0 then we append 0 to next place and 1 to the next place as possilbities
    //if lastplace is 1 then we append only o to the next place

    public static void printBinaryStrings(int n  , int lastPlace , String str){
        //base case >
        if(n == 0){
            System.out.println(str);
            return;
        }
        if(lastPlace == 0){
            //place 0 in the next place and also 1
            printBinaryStrings(n-1, 0, str+"0"); //mane hcche jodi dekhi j first element 0 bosano hyeche then ami baki n-1 er jonne lastelement 0 set korlam for 1 poss and tar sathe append e o korlam 0
            printBinaryStrings(n-1, 1, str+"1"); //mane hcche jodi dekhi j first element 0 bosano hyeche then ami baki n-1 er jonne lastelement 1 set korlam for another poss and tar sathe e 0 1 append korlam
        } else { //if not 0 that is 1 only then 
            printBinaryStrings(n-1, 0, str+"0"); //mane hcche jodi dekhi j first element 1 bosano heyche then ami baki n-1 er jonne last element sudhu matro 0 ii bosate parbo and append kore debo ami 0 k
        }
    }
    public static void main(String[] args) {
        int n = 3; //size of the string
        int lastplace = 0;
        String str = "";
        System.out.println("the strings are : ");
        printBinaryStrings(n, lastplace, str);
    }
}
