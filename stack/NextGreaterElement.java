package stack;

import java.util.ArrayList;

public class NextGreaterElement {
    
    //the next greater element of some element x in an array is the first greater element
    //that is to the right of x in the same array

    //mane basically current element er jonne or right side er array tai jaja element ache
    //jodi kono element oi element er thekee boro thake right side e then final array te include
    //kro  nahole -1 lekho

    //[6,8,0,1,3]
    //[8,-1,1,3,-1]
    //6 er jonne nexy greter 8 , 8 er jonne keo nei 0 er jonne 1 ache , 1 er jonne 3 and 3 er jonne
    //keo nei

    //BRUTE FORCE >>

    public static int[] nextGreater(int[] arr){

        int n = arr.length;

        ArrayList<Integer> a = new ArrayList<Integer>();
        
        for(int i = 0 ; i < n ; i++){
            boolean greaterFound  = false;
            for(int j = i+1 ; j < n ; j++){
                if(arr[i] < arr[j]){
                    a.add(arr[j]);  
                    greaterFound = true;
                    break;
                }
            } 
            if(!greaterFound){
                a.add(-1);
            }
        }
        

        int[] result = new int[a.size()];

        for(int k = 0 ; k < a.size() ; k++){
            result[k] = a.get(k);
        }

        return result;
    }

    //OPTIMIESED APPROACH >>

    

    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};
        int[] result = nextGreater(arr);

        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
