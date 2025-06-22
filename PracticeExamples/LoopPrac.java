import java.util.ArrayList;

public class LoopPrac {

    public static void main(String[] args) {
        int[] arrInt = {1, 2, 3, 4, 5};
        ArrayList<Integer> arrListInt = new ArrayList<>();

        for (int i = 0; i < arrInt.length; i++) {
            System.out.println(arrInt[i]);
        }
        System.out.println();
        int j = 0;
        while (j < arrInt.length) {
            System.out.println(arrInt[j]);
            j++;
        }
        System.out.println();
        for (int eachElem : arrInt) {
            System.out.println(eachElem);
        }

        for (int i = 0; i < arrInt.length; i++) {
            arrListInt.add(arrInt[i]);
        }
        System.out.println(arrListInt);

        for (int eachElem : arrInt) {
            arrListInt.add(eachElem);
        }
        System.out.println(arrListInt);
    }
}