import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class WagrFileIO{
    
    private ArrayList<String> arrListofLines = new ArrayList<>();
    String fileName = "WagrRanking8:7.csv";

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

    
    // public ArrayList<String> getArrListofLines() {
    //     return arrListofLines;
    // }
    
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
            System.out.println();
            for (String line : arrListofLines) {
                String[] field = line.split(" \\| ");
                    //top 10 rank
                    if (regTop10 == true) {
                        int fieldPrimero = Integer.parseInt(field[0].replace(" ", ""));
                        if (fieldPrimero <= 10) {
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

    public void biggestMovesTopPlyrs(int biggestMoves, int NumOfPlyrs) {
                //these are for big moves 
        int topList1 = biggestMoves;
        int topNumOfPlyrs1 = NumOfPlyrs;
    
        int findMove = 0;
        
        ArrayList<String> arrList1 = new ArrayList<>();
        ArrayList<String> field1List = new ArrayList<>();
        
        for (String line : arrListofLines) {
            String[] field = line.split(" \\| ");
            //only interested in top 100 players
            // - convert field[0] to integer before looping thru
            int fieldZero = Integer.parseInt(field[0].replace(" ", ""));
            // field[0] is less than 100 add the value to new array list
            if (fieldZero <= topNumOfPlyrs1) {
               
                    arrList1.add(line);
                    field1List.add(field[1].replace(" ", ""));
                
            }
            
            //abs value    
            int fieldOne = Integer.parseInt(field[1].replace(" ", ""));
            int fieldOneAbs = Math.abs(fieldOne);
            if (fieldOneAbs > findMove) {
                findMove = fieldOneAbs;
                
            } 
            
        } //end of for
        
        //making each element in field1List to be an integer and abosulute
        ArrayList<Integer> field1IntList = new ArrayList<>();
        for (String eachElem : field1List) {
            // make integer
            int eachElemInt = Integer.parseInt(eachElem);
            //abs value
            int eachElemIntAbs = Math.abs(eachElemInt);
            field1IntList.add(eachElemIntAbs);
        }
        ArrayList<Integer> moveIndexTracker = new ArrayList<>();
        for (int i = 1; i <= topList1; i++) {
            //finding the max element
            int maxMove = Collections.max(field1IntList);
            //finding the index of max element
            int maxIndex = field1IntList.indexOf(maxMove);
            //add index to the tracker
            
            if (moveIndexTracker.contains(maxMove)) {
                continue;
            } else {
                moveIndexTracker.add(maxIndex);
                field1IntList.set(maxIndex, 0);
            }
        }

        
        System.out.println("\nTop " + topList1 + " biggest moves out of the top " + topNumOfPlyrs1 + " players:");
        for (int eachEl : moveIndexTracker) {
            System.out.println(arrList1.get(eachEl));
        }
        

    }


}


