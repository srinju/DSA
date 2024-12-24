import java.math.BigInteger;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        //[1,2,3] ==> 123 + 1 = [1,2,4]
        //convert each element of the array to string 
        //then string to number
        //then add 1 to it
        StringBuilder numberString = new StringBuilder();
        for(int num : digits){ //for all numbers in the digits array
            numberString.append(num); //make all the numbers in the array to string
        }
        //convert the string to number now using parseInt
        BigInteger number = new BigInteger(numberString.toString());
        BigInteger result = number.add(BigInteger.ONE);
        //now do the reverse that is convert the result to a string
        //splitting each element into string 
        //add into array

        //conver number back into string
        String numberStr2 = result.toString();
        //create a new arr>
        int[] temp = new int[numberStr2.length()];
        //convert each char into integer and store into arr
        for(int i = 0 ; i < numberStr2.length() ; i++){
            temp[i] = Character.getNumericValue(numberStr2.charAt(i)); //add the string to array by converting into array
        }
        return temp;
    }
}
