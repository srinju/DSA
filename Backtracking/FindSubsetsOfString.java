package Backtracking;

public class FindSubsetsOfString {
    
    //given a string we have to find the subsets of a given string 
    //"abc" --> given string
    // a,b,c,ab,,bc,ac,abc,"" --> subsets of the string (null set is also a subset)
    //here we can see that if a string length is n there can be total 2^n subsets of the string

    public static void findSubsets(String str , String ans , int i){

        //here we can see that each charecter of the string has a choice
        //either theuy want to be a part of the subset or either they dont want to be a part of the subset
        //like that there will be levels and different subsets will be created
        //a more clear understanding can be done with pen and paper , discussing each choice of all the charecters in the string
        //we can depict that when we ask the charecters of all indexes in the string we reach to the end
        //and then we will have to backtrack to the previous index and consider their no choice too

        //base case>
        if(i==str.length()){
            if(ans.length() == 0){
                System.out.println("empty string");
            }
            System.out.println(ans);
            return;
        }
        //kaam>
        //yes choice >
        findSubsets(str, ans+str.charAt(i), i+1); //for the yes choice we add the charecter in the string to the ans array
        //no choice
        findSubsets(str, ans, i+1); //we dont store the charecters to the choice as they are the no choices of the string

    }
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0);
    }
}
