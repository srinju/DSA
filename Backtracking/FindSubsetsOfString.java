package Backtracking;

public class FindSubsetsOfString {
    
    //given a string we have to find the subsets of a given string 
    //"abc" --> given string
    // a,b,c,ab,,bc,ac,abc,"" --> subsets of the string (null set is also a subset)
    //here we can see that if a string length is n there can be total 2^n subsets of the string

    public static void findSubsets(String str , String ans , int i){ //O(n*2^n)

        //here we can see that each charecter of the string has a choice
        //either theuy want to be a part of the subset or either they dont want to be a part of the subset
        //like that there will be levels and different subsets will be created
        //a more clear understanding can be done with pen and paper , discussing each choice of all the charecters in the string
        //we can depict that when we ask the charecters of all indexes in the string we reach to the end
        //and then we will have to backtrack to the previous index and consider their no choice too

    /*
                                    
                                                    findSubsets("abc", "", 0)
                                                            |
                                            -------------------------------
                                            |                             |
                                        include 'a'                     exclude 'a'
                                            |                             |
                                    findSubsets("abc", "a", 1)    findSubsets("abc", "", 1)
                                            |                             |
                                    ---------------                ---------------
                                    |             |                |             |
                                    include 'b'   exclude 'b'    include 'b'   exclude 'b'
                                    |             |                |             |------------------|
           findSubsets("abc", "ab", 2)  findSubsets("abc", "a", 2)   findSubsets("abc", "b", 2)  findSubsets("abc", "", 2)
                                    |             |                |             |               |
                                    ---------------             ---------------             ---------------             ---------------
                                    |             |             |             |             |             |             |             |
                                    include 'c'  exclude 'c'   include 'c'  exclude 'c'    include 'c'  exclude 'c'   include 'c'  exclude 'c'
                                    |             |             |             |             |             |             |             |
            findSubsets("abc", "abc",  3) findSubsets("abc", "ab",  3) findSubsets("abc", "ac", 3) findSubsets("abc", "a", 3) findSubsets("abc", "bc", 3) findSubsets("abc", "b", 3) findSubsets("abc", "c", 3) findSubsets("abc", "", 3)
                                    |             |             |             |             |             |             |             |
                                    print "abc"  print "ab"    print "ac"   print "a"      print "bc"    print "b"    print "c"    print "empty string"



        Step-by-Step Explanation:
        Start with the initial call: findSubsets("abc", "", 0)

        The first character is "a". We have two choices:
        Include "a": This takes us to findSubsets("abc", "a", 1).
        Exclude "a": This takes us to findSubsets("abc", "", 1).
        Include "a": Now, at index 1, the character is "b".

        Again, two choices:
        Include "b": This leads to findSubsets("abc", "ab", 2).
        Exclude "b": This leads to findSubsets("abc", "a", 2).
        Include "b": Now, at index 2, the character is "c".

        Two choices:
        Include "c": This leads to findSubsets("abc", "abc", 3) (which prints "abc").
        Exclude "c": This leads to findSubsets("abc", "ab", 3) (which prints "ab").
        Backtrack to previous decision (exclude "b"):

        Exclude "b": Now, at index 2, we still have the choices:
        Include "c": This leads to findSubsets("abc", "ac", 3) (which prints "ac").
        Exclude "c": This leads to findSubsets("abc", "a", 3) (which prints "a").
        Backtrack to index 0 and exclude "a":

        Exclude "a": Now, at index 1, the character is "b".
        Include "b": This leads to findSubsets("abc", "b", 2).
        Exclude "b": This leads to findSubsets("abc", "", 2).
        Include "b": Now, at index 2, the character is "c".

        Two choices:
        Include "c": This leads to findSubsets("abc", "bc", 3) (which prints "bc").
        Exclude "c": This leads to findSubsets("abc", "b", 3) (which prints "b").
        Backtrack to index 1 and exclude "b":

        Exclude "b": Now, at index 2, we still have the choices:
        Include "c": This leads to findSubsets("abc", "c", 3) (which prints "c").
        Exclude "c": This leads to findSubsets("abc", "", 3) (which prints the empty string "empty string").
        Output:
        As a result of the above recursive calls and decisions, the following subsets are printed:

        
        Copy code
        empty string
        a
        ab
        abc
        ac
        b
        bc
        c

         */

        //base case>
        if(i==str.length()){
            if(ans.length() == 0){
                System.out.println("empty string");
            } else {
                System.out.println(ans);
            }
            return;
        }
        //kaam>
        //backtracking 101 >> the recursive calls you see below are both independent operations .. they are both checking both the choices
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
