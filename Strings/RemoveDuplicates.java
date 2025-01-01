package Strings;

public class RemoveDuplicates {
    //remove duplicates in a string
    //aaabbbccc ==> abc
    public static String removeCommon(String str){
        //we traverse through the string and check if the next index is same as the previous index then we append the charecter to the str builder
        int n = str.length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < n ; i++){ //traverse throight the loop
            if(i==0 || str.charAt(i) != str.charAt(i-1)){ //if the first element is 0 then append the first element and check that the previous element is not equlas to the current element 
                if(sb.toString().indexOf(str.charAt(i)) == -1){ //check if the current element already exisits in the str builder or not
                    sb.append(str.charAt(i)); //append the element to the str builder
                }  
            }
        }
        return sb.toString(); //return the string builder by converting it into a string
    }
    public static void main(String[] args) {
        String str1 = "aabbbccc"; //remember the test case would fell for appa as we are checling only the concequtive ones ... for appa kind of test case we need hash set which will be done later 
        String str2 = "appappa";
        System.out.println("the string aabbbccc after removing duplicates is : " + removeCommon(str1));
        System.out.println("the string appappa after removing duplicates is : " + removeCommon(str2));
    }
}
