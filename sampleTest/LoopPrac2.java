import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LoopPrac2
 */
public class LoopPrac2 {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("strawberry");
        fruits.add("mango");
        fruits.add("piNeapple");
        fruits.add("orange");

        System.out.println(fruits);
        System.out.println("Removed: " + fruits.remove(0));
        fruits.remove("cherry");
        System.out.println(fruits);
        fruits.removeFirst();
        System.out.println(fruits);
        List<String> reversedFruits = fruits.reversed();
        reversedFruits.add("brocili");
        System.out.println(reversedFruits);
        ArrayList<String> fruitsArrRevList = new ArrayList<>();
        reversedFruits.addAll(fruitsArrRevList);
        System.out.println();
        System.out.println(reversedFruits);

        System.out.println();
        System.out.println(fruits);

        String joinedFruits = String.join(" Hello|Hello ", fruits);
        System.out.println("joinedFruits: " + joinedFruits);
        ArrayList<String> jfsArrList = new ArrayList<>();
        String[] joinFruitsSplit = joinedFruits.split("n|N");
        for (String eachElem : joinFruitsSplit) {
            jfsArrList.add(eachElem);
        }
        System.out.println(jfsArrList);



        // for (String each : fruits) {
        //     System.out.println(each);
        // }

        // for (int i = 0; i < fruits.size(); i++) {
        //     System.out.println(fruits.get(i));
        // }

        int j = 0;
        while (j < fruits.size()) {
            System.out.println(fruits.get(j));
            
            
            
            
            
            j++;
        }

    }
}