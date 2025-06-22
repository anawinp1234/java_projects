import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class WagrFileIO{
    
    private ArrayList<String> arrListofLines = new ArrayList<>();
    String fileName = "wagrranking08092024.csv";

    public WagrFileIO(String fileName) {
        // fileName is file name
        BufferedReader reader;
        String line;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            while ((line = reader.readLine()) != null) {
                String newLine = line.replaceAll("\"", "");
                if (line.contains("Move")) {
                    continue;
                }
                String[] field = newLine.split(",");

                String newStrLine = String.join(" | ", field[0].format("%4s", field[0]), 
                                                       field[1].format("%5s", field[1]), 
                                                       field[3].format("%-26s", field[3]), field[2]);
                arrListofLines.add(newStrLine);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void findOnePlyer2(String player) {
        String onePlyrName = player;
        ArrayList<String> nameList = new ArrayList<>();
        for (String line : arrListofLines) {
            String[] field = line.split(" \\| ");
            if (field[2].contains(onePlyrName)) {
                nameList.add(line);
            }
        }
        System.out.println("\nOne particular player:");
        if (nameList.isEmpty()) {
            System.out.println("No one here bro.".toUpperCase());
        } else {
            for (String each : nameList) {
                System.out.println(each);
            }
        }      
    }

    public void favPlayersMeth(String[] favoritePlayers1) {
        String[] favoritePlayersArrNames = favoritePlayers1;
        ArrayList<String> favPlyrsArrList = new ArrayList<>();
        for (String line : arrListofLines) {
            String[] field = line.split(" \\| ");
            for (String eachElem : favoritePlayersArrNames) {
                if (field[2].contains(eachElem)) {
                    favPlyrsArrList.add(eachElem);
                    System.out.println(line);
                }
            }
        }
    }

    public void topTen(boolean regTop10) {
            //these are for regular top 10
        ArrayList<String> topX = new ArrayList<>();
        regTop10 = true;
        for (String line : arrListofLines) {
            String[] field = line.split(" \\| ");
                //top 10 rank
                if (regTop10 == true) {
                    int fieldZeroInt = Integer.parseInt(field[0].replace(" ", ""));
                if (fieldZeroInt <= 10) {
                        topX.add(line);
                }
            }
        }
            if (regTop10 == true) {
                System.out.println("\nTop 10 Players: ");
                for (String eachtopXElem : topX) {
                    System.out.println(eachtopXElem);
                }
            }
    }

    public void biggestMovesTopPlyrs(int biggestMoves, int NumOfPlyrs, String move) {
        //these are for big moves 
        int tm = biggestMoves;
        int tr = NumOfPlyrs;
        String moveChoice = move;
        ArrayList<String> trArrList = new ArrayList<>();
        ArrayList<String> lineTracker = new ArrayList<>();
        ArrayList<Integer> allMovesList = new ArrayList<>();
        // build a trArrList
        for(int i = 0; i < tr; i++){
            trArrList.add(arrListofLines.get(i));
        }
        // parse string and convert to interger (and make abs value for comparision) of the move field into an allMovesList
        for (String eachLine : trArrList) {
            String[] field = eachLine.split(" \\| ");
            int fieldOneInt = Integer.parseInt(field[1].replace(" ", ""));
            if (moveChoice.equals("moveAbs")) {
                int fieldOneIntAbs = Math.abs(fieldOneInt);
                allMovesList.add(fieldOneIntAbs);
            } else if (moveChoice.equals("moveUp")) {
                allMovesList.add(fieldOneInt);
            } else if (moveChoice.equals("moveDown")) {
                allMovesList.add(fieldOneInt);
            }
        }
        
        // loop number of time in tm
        for (int i = 1; i <= tm; i++) {
            int maxIndex = 0;
            // loop through all the allMovesList to find the max value and its index
            for (int j = 0; j < allMovesList.size(); j++) {         
                if (moveChoice.equals("moveDown")) {
                    if (allMovesList.get(j) <= allMovesList.get(maxIndex)) {
                        maxIndex = j;
                    }
                } else {
                    if (allMovesList.get(j) >= allMovesList.get(maxIndex)) {
                        maxIndex = j;
                    }
                }
            } 
            // remove the index that holds the max move value from allMovesList and TrArrList
            allMovesList.remove(maxIndex);
            String maxValueLine = trArrList.remove(maxIndex);
            // put the line that got removed into a new arrayList called lineTracker
            lineTracker.add(maxValueLine);
        }
        if (moveChoice.equals("moveAbs")) {
            System.out.println("\nTop " + tm + " biggest moves out of the top " + tr + " players: (Move Abs)");
        } else if (moveChoice.equals("moveUp")) {
            System.out.println("\nTop " + tm + " biggest moves out of the top " + tr + " players: (Move Up)");
        } else if (moveChoice.equals("moveDown")) {
            System.out.println("\nTop " + tm + " biggest moves out of the top " + tr + " players: (Move Down)");
        }
        for (String eachElem : lineTracker) {
            System.out.println(eachElem);
        }
    } // end of biggestMovesTopPlyrs method

    public void findCountry(String country) {
        ArrayList<String> countryArrList = new ArrayList<>();
        ArrayList<String> newArrList = new ArrayList<>();
        for (String eachLine : arrListofLines) {
            String[] field = eachLine.split(" \\| ");
                if (field[3].contains(country)) {
                    countryArrList.add(eachLine);
                }
        }
        for (String each : countryArrList) {
            System.out.println(each);
        }

        
        
        
        
    }
    
} // end of class




