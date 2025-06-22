import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class WagrFileIO{
    public static void main(String[] args) {
        
        String[] interestedPlyrs = {"Anawin", "Mahanth", "Connor Williams", "Johnny Walker", "Pongsapak", "Luke Potter"};
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader("ranking.csv"));
            String line;
            while ((line = reader.readLine()) != null) {
                
                String nLine = line.replaceAll("\"", "");
                // System.out.println(nLine);
                String[] field = nLine.split(",");
                // System.out.println(field[3]);

                // if (nLine.contains("Anawin")) {
                //     System.out.println(nLine);
                // }

                // if (field[3].equals("Anawin Pikulthong")) {
                //     System.out.println(nLine);
                // }

                // if (field[3].contains("Connor W")) {
                //     System.out.println(field[3] + " ranking: " + field[0]);
                // }

                // if (field[2].equals("Thailand")) {
                //     // System.out.println(nLine);
                //     System.out.println(field[3] + " ranking: " + field[0]);
                // }

                // for (String player : interestedPlyrs) {
                //     if (field[3].contains(player)) {
                //         System.out.println(field[0] + "\t" + field[1] + "\t" + field[3]);
                //     }
                // }



            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}