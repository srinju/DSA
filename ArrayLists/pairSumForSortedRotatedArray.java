package ArrayLists;

import java.util.ArrayList;

public class pairSumForSortedRotatedArray {
    
    //brute force can be done like the pairSum brute force approach >

    //for optimised we will have to use this >

    //remember that for any rotated sorted array . for any scene we have to use two pointer approach 
    //then we have to use the lp as (lp+1)%n
    // and rp as (n+rp-1)%n

    //so firsst we find the breaking point that is when the array is getting not sorted then we make the i+1 as the lp and the i as the rp 
    //coz jodi dekhis i ta kitu last er dike thakari kotha
    //and then we do while(lp!=rp)
    //jodi target er same ase sum then toh add kore dao arraylist e 
    //r jodi target is greater than sum tar mane holo boro nmber er dike move koro tale lp agey barao
    //r jodi targer is smaller than sum tar mane choto number er doke move koro tale rp k move kore
    //and ei last duto case e we do the lp and rp formulas

    public static ArrayList<String> pairSumRotatedShit(ArrayList<Integer> list , int target , int lp , int rp){
        int n = list.size();
        ArrayList<String> pairs = new ArrayList<>();
        //find breaking point>
        for(int i = 0 ; i < n-1 ; i++){
            if(list.get(i)> list.get(i+1)){
                lp = i+1;
                rp = i;
            }
        }
        //now we do >
        while(lp!=rp){
            if((list.get(lp) + list.get(rp)) == target){
                pairs.add("(" + list.get(lp) + "," + list.get(rp) + ")");
            }
            if((list.get(lp) + list.get(rp)) < target){ //then move to lager values that is move lp
                lp = (lp+1)%n;
            } else { //move the rp that is go to larger values
                rp=(n+rp-1)%n;
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;

        ArrayList<String> pairs = pairSumRotatedShit(list, target, 0, list.size()-1);

        if(pairs.isEmpty()){
            System.out.println("no pairs");
        } else {
            System.out.println("the pairs are : ");
            for(int i = 0 ; i < pairs.size() ; i++){
                System.out.print(pairs.get(i) + " ");
            }
            System.out.println();
        }
    }
}
