package stack;

import java.util.Arrays;

public class CarFleet {
    public int carFleet(int target, int[] position, int[] speed) {
    //we can see like
       //if a car reaches the destination befor the next car reaches the target then they meet and travel to target together as a fleet

        //another thing to consider is we are gonna keep a track of the car that is most closest to the position
        //because if the rest of the car becomes a fleet at some point it is not gonna happen after the most closest car to the target

        //what we do is we make a 2d array of the both given arrays
        //then sort it in descending order

        //and then we travel through that array
        //and the first element is the car at the beginning (closest to target)

        //we push the time of the cars in the stack 
        //and then check if the next time is lesser than that
        //also if stack size > 2 then we 

        int n = position.length;

        if(n == 0 ){
            return 0;
        }
        double[][] pair = new double[n][2]; //n rows and 2 cols 2d array

        //pair posn and speed >>
        for(int i = 0 ; i < n ; i++){
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }

        //sort in descending order >>

        Arrays.sort(pair , (a,b) -> Double.compare(b[0] , a[0]));

        //Stack<Double> s = new Stack<>();

        //travel through the 2d array of size  n >
        int fleets = 0;
        double prevCarTime = 0;
        for(int i = 0 ; i < n ; i++){

            double currentCarTime = (double) (target - pair[i][0]) / pair[i][1];
            
            /*
             if (currentCarTime <= prevCarTime) {
                // Current car joins the previous fleet
                // Do nothing, since it catches up
            } else {
                // Current car forms a new fleet
                fleets++;
                prevCarTime = currentCarTime;
            }
             */
            if(currentCarTime <= prevCarTime){
                fleets++; //current car make his own fleet
                prevCarTime = currentCarTime;
            }
            //else the current car joins the prev car and finish togehter which makes the fleet unchanged
        }

        return fleets;

    }
}
