import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class WagrIO{
    public static void main(String[] args) {
        
    
        try {
            BufferedReader reader = new BufferedReader(new FileReader("WomensRanking.csv"));
            String line;
            int findMove = 0;
            String s1 = "";
            while ((line = reader.readLine()) != null) {
                String fullLine = line.replaceAll("\"", "");
                String[] field = fullLine.split(",");
                
                 
                if (field[1].contains("Move")) {
                    continue;
                }
                int fieldOne = Integer.parseInt(field[1]);
                int fieldOneAbs = Math.abs(fieldOne);
                            
                
                
                if (fieldOneAbs > findMove) {
                    findMove = fieldOneAbs;
                    s1 = fullLine;
                }

                
                



                // System.out.println(findMove);
                // System.out.println(fullLine);
                
                
                // for (String moveConvert : field){
                
                //     int moveInt = Integer.parseInt(moveConvert);
                //     System.out.println(moveInt);
                // }
                
                
                // for (String each : nums) {
                //     if (field[0].equals(each)) {
                //         System.out.println(fullLine);
                //     }           
                // }
                
                // if (field[0].contains("Rank")) {
                //     continue;
                // } 
                // String fields1 = field[0];
                // int fieldZero = Integer.parseInt(field[0]);
                // System.out.println(fieldZero);
                // if (fieldZero <= 10) {
                //     System.out.println(fullLine);
                // }
                
                // if (fieldZero <= 20 && fieldZero >= 11 ) {
                //     System.out.println(fullLine);
                // } 
            } //end of while loop
            System.out.println(findMove);
            System.out.println(s1);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

