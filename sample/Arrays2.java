import java.util.ArrayList;
import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("grapes");
        fruits.add("mango");
        fruits.add("cherry");

        System.out.println(fruits);

        Object[] fruitsArray = fruits.toArray();
        
        // for (Object x : fruitsArray) {
        //     System.out.println(x);
        // }

        // for (int i = 0; i < fruitsArray.length; i++) {
        //     System.out.println(fruitsArray[i]);
        // }

        Scanner input = new Scanner(System.in);
        System.out.print("Type Here: ");
        String choice = input.nextLine();
        
        if (fruits.contains(choice)) {
            System.out.println("IN THE LIST");
        } else {
            System.out.println("NOT IN THE LIST");
        }
        


    }
}