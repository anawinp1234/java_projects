import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
public class TestLoop3 {
    String n1 = "Anawin";
    public static void main(String[] args) {
        String[] names = {"Anawin","John","Nick","Smith","Don","Ron","Steve","Mike","Joe"};


        ArrayList<String> namesL = new ArrayList<>();

        // for (int i = 0; i < names.length; i++) {
        //     namesL.add(names[i]);
        // }

        // int j = 0;
        // while (j < names.length) {
        //     namesL.add(names[j]);
        //     j++;
        // }

        for (String x : names) {
            namesL.add(x);
        }
        
        System.out.println(namesL);

        
        
        namesL.add(5, "Here");
        System.out.println(namesL);

        
        
        // Scanner input = new Scanner (System.in);
        // System.out.print("Type here: ");
        // input.nextLine();
        
        // if (namesL.contains("Anawin")) {
        //     System.out.println("Has n");
        // } else {
        //     System.out.println("No n");
        // }
        // input.close();
        
        
        
        
        // System.out.println(namesL.contains("d"));

    }
}


