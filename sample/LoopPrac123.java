import java.util.ArrayList;

public class LoopPrac123 {
    public static void main(String[] args) {
        String[] states = {"Arizona", "California", "Nevada", "Utah"};
        ArrayList <String> statesArrList = new ArrayList<>();

        for (int i = 0; i < states.length; i++) {
            System.out.println("===========");
            for (int j = 0; j < 3; j++) {
                System.out.println("     " + states[i]);
                for (int z = 0; z < 2; z++) {
                    System.out.println("        ----------");
                }
            }
        }

        // int j = 0;
        // while (j < states.length) {
        //     System.out.println(states[j]);
        //     j++;
        // }

        // for (String eachElem : states) {
        //     System.out.println(eachElem);
        // }
        


    }
}