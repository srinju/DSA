package ArrayLists;

import java.util.ArrayList;

public class ContainerWithMostWater {
    
    //PROBLEM STATEMENT>

    //for given n lines on x -axis , use 2 lines to form a container such that it holds maximum water
    //height = [1,8,6,2,5,4,8,3,7]

    //ARRPOACH>

    //we see that the max width that is on x axis from the 8 to 7 that is width = 7
    //that is nothing but the length of the array - 1 that is 7
    //and the height that it can hold is upto 7 , coz that is the shorted side and over that the water will spill out
    //therefore water = gt*width => 7*7 = 49

    //we find all possible pairs of the line
    //and for height we take the smaller line
    //and the widthis both the lines' indexes ka subtraction
    //so we find the height by min(l1,l2) that is i and j are l1 and l2
    //and for width we find the subtraction of indexes that is j-1
    //and for water we do --> height*width


    //OPTIMESED APPROACH >

    //TWO POINTER APPROACH>
    //two pointer left pointer and right pointer
    //area for them find out tht is area = min(ht of the pointers) * (difference between the pointers that is the width)
    
    //if lp ht < rp ht the lp++ else rp-- (that is jodi left pointer ht choto hoi right er maal er theke then ami lp k agey barabo and then koto ta water dhorche calculate korbo else jodi boro hye mall tale rp k left side er dike barabo and then calculate korbo)
    // and we will do this shit while lp<rp

    public static int maxWaterThatCanHold(ArrayList<Integer> height){ //brute force approach with O(n^2) TC
        int maxWater = 0;
        for(int i = 0 ; i <height.size() ; i++){
            for(int j = i+1 ; j < height.size() ; j++){
                int ht = Math.min(height.get(i), height.get(j)); //find the min hright of the container
                int width = j-i;
                int currentWater = ht*width;
                maxWater = Math.max(maxWater, currentWater);
            }
        }
        return maxWater;
    }

    public static int maxWaterOptimised(ArrayList<Integer> height){ //two pointer approach --> O(n)
        int lp = 0;
        int rp = height.size()-1;
        int maxWater = 0;
        while(lp<rp){
            int containerWidth = rp-lp;
            int containerHeight = Math.min(height.get(lp), height.get(rp));
            int currentWater = containerHeight * containerWidth;
            maxWater = Math.max(maxWater, currentWater);
            if(height.get(lp) < height.get(rp)){ //we always move the smaller ht line as if we dont then there will be three cases that is next line is larger equal or less .. on all 3 cases if we see the area will be less as the water in container is controlled by the smaller ht line
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        int result = maxWaterOptimised(height);
        System.out.println("the maximum water the container can hold is  : " + result);
    }
}
