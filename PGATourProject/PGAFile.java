import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PGAFile {
    
    public static void main(String[] args) {
        String name = "Tiger";
        try {
            BufferedReader reader = new BufferedReader(new FileReader("pgatour_raw.csv"));
            String line;
            double longDrive = 0.0;
            String longDriveLine = "";
            double lowScore = 1000.0;
            String lowScoreLine = "";
            while ((line = reader.readLine()) != null) {
                
                String moneyRemoved = line.replaceAll("$", "");
                String[] field = line.split(",");
                if (line.contains("DRIVE")) {
                    continue;
                }

                
                double longDriveField = Double.parseDouble(field[4]);
                if (longDriveField > longDrive) {
                    longDrive = longDriveField;
                    longDriveLine = line;
                }

                // if (field[1].contains(name)) {
                //     System.out.println(line);
                // }

                double scoringField = Double.parseDouble(field[3]);
                if (scoringField < lowScore) {
                    lowScore = scoringField;
                    lowScoreLine = line;
                }

                // Integer.parseInt(field[13]);



                
                
                
            }

            System.out.println("Long Drive: " + longDriveLine);
            System.out.println("Low Score: " + lowScoreLine);
            
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}