package Recursion;

public class RemoveDuplicatesInAString {
    //remove duplicates in a string using recursion

    //APPROACH>
    //we will make a map wihcih is of type boolean and size 26 from a to z
    //a-a - 0
    //b-a - 1
    //c-a - 2
    //z-a - 25
    //so cuurent index of the map array can be found by cuurent indx - 'a'
    //base case > when i == n then whole string searched
    //kaam is check whether the char is present in map or not 
    //if yes then dont add in the str builder
    //and if not then add in the str builder
    //then run the recursive function for the next index .

    public static void removeDuplicates(String str , boolean[] map , int i , StringBuilder sb){
        int n = str.length();
        //base case >
        if(i == n){
            System.out.println(sb.toString());
            return;
        }
        //kaam >
        char currentChar = str.charAt(i);
        //now check if the index of the current char in map is true
        if(map[currentChar-'a']){
            //if true> then duplicate
            removeDuplicates(str, map, i+1, sb); //recursive call for the next index
        } else {
            //not duplicate then make that char true in the map array and append the charecter in the str builder
            map[currentChar-'a'] = true;
            removeDuplicates(str, map, i+1, sb.append(currentChar)); //appending the current char and forwarding the recursion for the next indexes
        }
    }
    
    public static void main(String[] args) {
        String str = "kapppaaaakk";
        StringBuilder sb = new StringBuilder();
        boolean[] map = new boolean[26];
        removeDuplicates(str, map, 0, sb);
    }
}
