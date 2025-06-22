import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

public class TestLoop2 {
    public static void main(String[] args) {
        
        String [] checking = {"Checking Account",
                              "Account Number: CA54321",
                              "Balance: $500.0",
                              "Overdraft Limit: $200.0",
                              "Deposited: $300.0",
                              "Withdrew: $600.0",
                              "Account Number: CA54321",
                              "Balance: $200.0",
                              "Overdraft Limit: $200.0"
                              };



        // Arrays.sort(checking);
        // for (int i = 0; i < checking.length; i++) {
        //     System.out.println(checking[i]);
        // }

        ArrayList <String> choke = new ArrayList<String>();
        for (int j = 0; j < checking.length; j++) {
            choke.add(checking[j]);
        }
        System.out.println(choke);

        for (String each : checking) {
            System.out.println(each);
        }

        int z = 0;
        while (z < checking.length) {
            System.out.println(checking[z]);
            z++;
        }
        
        

    
  
        // int x = checking.length;
        // for (int i = checking.length-1; i >= 0; i--) {
        //     System.out.println(x + ". " + checking[i]);
        //     x--;
        // }

        // int y = checking.length;
        // int start = checking.length;
        // while (y >= 0) {
        //     System.out.println(start + ". " + checking[y]);
        //     y--;
        //     start--;
        // }

        
        // Collections.reverse(Arrays.asList(checking));
        // int z = checking.length;
        // for (String string2 : checking) {
        //     System.out.println(z + ". " + string2);
        //     z--;
        // }
       
       
        // int x = 1;
        // for (String string : checking) {
        //     // System.out.println(string);
        //     System.out.println(x + ". " + string);
        //     x = x + 1;
        // }

        // int y = 1;
        for (int i = 0; i < checking.length; i++ ) {
            System.out.println(i+1 + ". " + checking[i]);
            // y++; 
        }

        // int i = 0;
        // int z = 1;
        // while (i < checking.length) {
        //     System.out.println(z + ". " + checking[i]);
        //     i++;
        //     z++;
        // }
        
        
        
        
        
    }
    
    // for(int x = 1; x <= checking.length; x++){
        // for (int i = 0; i < checking.length; i++) {
            //     if (i == 5) {
                //         System.out.println("Irrelevant");
                //     } else if (i > 2) {
                    //         System.out.println("Necessary");
                    
                    //     } else {
                        //         System.out.println(i);
                        //     }
                        // }
                        
                        // for (int i = 0; i < )
                        
                        
                        
                        
                    // }
                
                // System.out.print(x + ". ");
            
        
            
        
        
            
        
            // x = x + 1;
}