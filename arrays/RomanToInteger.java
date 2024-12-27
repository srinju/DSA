public class RomanToInteger {
    public int romanToInt(String s) {
        //so basically in this , if i + 1 value is greater than the i value then there will be sub else add
        //also i+1 < n
        int[] roman = new int[128]; //we make the integer array with ascii values
        //and map the ascii values to the roman numerics
        roman['I'] = 1;
        roman['V'] = 5;
        roman['X'] = 10;
        roman['L'] = 50;
        roman['C'] = 100;
        roman['D'] = 500;
        roman['M'] = 1000;
        int result = 0;
        for(int i = 0 ; i + 1 < s.length() ; i++){ //traverse through the loop making sure that i+1 < size of the string
            if(roman[s.charAt(i)] < roman[s.charAt(i+1)]){ //whenevr the char value is less than the next char
                result = result - roman[s.charAt(i)]; //we subtract that char val from the result
            } else {
                result = result + roman[s.charAt(i)]; //we add that char val from the result
            }
        }
        return result + roman[s.charAt(s.length() - 1)]; //for the last charecter in the string which has not been processed
    }
}
