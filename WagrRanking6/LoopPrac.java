import java.util.ArrayList;

public class LoopPrac {
    public static void main(String[] args) {
        String[] fruits = {"apples", "banana", "orange", "strawberry", "cherry"};

        ArrayList<String> fruitsList = new ArrayList<>();

        for (int i = 0; i < fruits.length; i++){
            fruitsList.add(fruits[i]);
        }
        System.out.println(fruitsList);

        int j = 0;
        while (j < fruits.length) {
            fruitsList.add(fruits[j]);
            j++;
        }
        System.out.println(fruitsList);

        for (String eachElem : fruits) {
            fruitsList.add(eachElem);
        }
        System.out.println(fruitsList);
  
    }
}
