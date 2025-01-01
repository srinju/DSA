package Recursion;

public class FriendPairingProblem {

    //PROBLEM STATEMENT >

    //given n frnds , each one can remain single or can be paired with some other
    //friend . Each frnd can be paired only once . Find out the total number of ways 
    //in which friends can remain single or can be paired up

    //APPROACH > 

    //base case is that if n = 1 and n = 2 then return 1 and 2 respectively
    //we can analyse that there are two choices one is staying single and one is paring up
    //if one decides to stay single then there will be n-1 people to be paired 
    //and if one decides to pair up then there will be n-2 people to be paired up
    //and if one decides to pair up also he/she will have n-1 people to select for pairt that is 1 ta manush n-1 loger sathe pair banate parbe
    //therefore for pairing up we have n-1 choices and the rest people are n-2 who will need to be paired up
    //therefore total ways will be {f(n-1)} + {f(n-1)*f(n-2)}
    //first curly part is for the decision to stay single
    //second curly part is for the decision to pair up the n-1 part is for one person who got n-1 choices to pair up and rest are n-2 who needs to be paired up

    public static int NumberOfWays(int n){
        //base case >
        if(n == 1 || n == 2){
            return n;
        }
        //single choice >
        int f_nm1 = NumberOfWays(n-1);
        //double choice >
        int f_nm2 = (n-1) * NumberOfWays(n-2);
        //total ways > 
        int totalWays = f_nm1 + f_nm2;
        return totalWays;
    }
    public static void main(String[] args) {
        int n = 3; //number of friends 
        System.out.println("Number of pairs possible are : " + NumberOfWays(n));
    }
}
