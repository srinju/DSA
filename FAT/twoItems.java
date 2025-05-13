
package FAT;
import java.util.*;

public class twoItems {
    
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        //no of people>
        System.out.println("enter the no of people");
        int n = sc.nextInt();
        sc.nextLine();
        //enter items
        System.out.println("enter the list of items with space");
        String[] items = sc.nextLine().split(" ");

        //each person is a map of item ->. count
        List<Map<String,Integer>> poeple = new ArrayList<>();
        for(int i = 0 ; i < n ; i ++){
            poeple.add(new HashMap<>());
        }

        int index = 0 ; //curr person index
        for(String item : items){
            boolean given = false;
            //try giving item to next n poeple>
            for(int i = 0 ; i < n ; i ++){
                Map<String,Integer> person = poeple.get(index);
                int count  = person.getOrDefault(item, 0);

                if(count < 2){
                    person.put(item , count + 1);
                    given = true;
                    break;
                }

                index = (index + 1) % n;
            }

            if(!given) {
                System.out.println("could not assign : " + item);
            }
        }

        for(int i = 0 ; i < n ; i ++) {
            System.out.println("person " + (i+1) + ": " + poeple.get(i));
        }

        sc.close();
    }
}
