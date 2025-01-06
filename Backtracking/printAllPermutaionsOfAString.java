package Backtracking;

public class printAllPermutaionsOfAString {
    
    //we have to find all permutations of a string
    //we know that if there are n elements then there will be n! permutaions 
    
    public static void findPermutations(String str , String ans){
        
        //first place er jonne 3 te choice then tar porer tar jonne akta choice kom
        //r last er place er jone ja beche ache setai
        //so what we are doing is we are placing the charecter the place wants to be fitted
        //and then we backtrack and satisfy all the remaining choices one by one for each place 

        //base case >

        if(str.length() == 0){//str.length() == 0 means the permutaion has been created and no charecter left in str
            System.out.println(ans);
            return;
        }

        //kaam>

        //so what we will do is we traverse through all the places and for each place we add that current charecter in the ans string and remove that charecter from the string str
        for(int i = 0 ; i < str.length() ; i++){
            char currChar = str.charAt(i); //current char in the loop
            //first delete the charecter from the str string
            //{a,b,c,d,e} ==> if we want to remove c then --> {a,b} + {d,e} ==> {a,b,d,e} ==> so we will use the substring function for this
            String newStr = str.substring(0, i) + str.substring(i+1);
            //now add the current char to the ans string
            findPermutations(newStr, ans+currChar); //what this mf is doing is that it adds currchar to the current place and recursively perform for all the other places as well then all the places overs then it runs for the forloop again for the next place . with this all the choices gets covered
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findPermutations(str, "");
    }
}
