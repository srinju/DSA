package FAT;
import java.util.*;

public class twoItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no of peeps");
        int k = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.println("enter the items");
        String[] items = sc.nextLine().split(" ");

        Map<String, Integer> count = new HashMap<>();
        for (String item : items)
            count.put(item, count.getOrDefault(item, 0) + 1);

        boolean possible = true;
        for (int freq : count.values()) {
            if (freq > 2 * k) {
                possible = false;
                break;
            }
        }

        System.out.println("dist poss ? " + possible);
        sc.close();
    }
}
