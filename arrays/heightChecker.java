import java.util.Arrays;

public class heightChecker {
    public static int heightChecker(int[] heights) {
        //clone the heights array
        //sort the array
        //then check if the heights array matching the expected heights array or not
        int n = heights.length;
        int[] expectedHeights = heights.clone(); //clone d ht arr into expHt arr
        Arrays.sort(expectedHeights); //sort the cloned arr
        int misplacedIdx = 0 ; //init the misplaced idx
        for(int i = 0 ; i < n ; i++){
            if(heights[i] != expectedHeights[i]){
                misplacedIdx++;
            }
        }
        return misplacedIdx;
    }
}
