import java.io.BufferedReader;
import java.io.FileNotFoundException;
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
                arrListofLines.add(newLine);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    

    public void findOnePlyr(String onePlyrName1) {

            //find one particular player
            String onePlyrName = onePlyrName1;
            try {
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
                String line;
    
                String onePlyr = "";
                ArrayList<String> nameList = new ArrayList<>();
     
    
                while ((line = reader.readLine()) != null) {
                    String newLine = line.replaceAll("\"", "");
                    String[] field = newLine.split(",");
                    if (field[1].contains("Move")) {
                        continue;
                    }
    
                    if (field[3].contains(onePlyrName)) {
                        onePlyr = newLine;
                        nameList.add(onePlyr);
                    }
                    
                } //end of while
                reader.close();
                System.out.println("\nOne particular player:");
                System.out.println(onePlyr);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } 

    public void favPlayersMeth(String[] favoritePlayers1) {

            String[] favoritePlayersArr = favoritePlayers1;
            try {
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
                String line;
                ArrayList<String> favPlyrsArrList = new ArrayList<>();
                while ((line = reader.readLine()) != null) {
                    String newLine = line.replaceAll("\"", "");
                    String[] field = newLine.split(",");
                    if (field[1].contains("Move")) {
                        continue;
                    }
                    for (String eachElem : favoritePlayersArr) {
                        if (field[3].contains(eachElem)) {
                            favPlyrsArrList.add(eachElem);
                            System.out.println("Fav Player: " + eachElem);
                            System.out.println(newLine);
                        }
                    }
                } //end of while
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    public void topTen(boolean regTop10) {

            //these are for regular top 10
            regTop10 = true;
            System.out.println();
            try {
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
                String line;
                ArrayList<String> topX = new ArrayList<>();
                while ((line = reader.readLine()) != null) {
                    String newLine = line.replaceAll("\"", "");
                    String[] field = newLine.split(",");
                    if (field[1].contains("Move")) {
                        continue;
                    }
                    //top 10 rank
                    if (regTop10 == true) {
                        int fieldPrimero = Integer.parseInt(field[0]);
                        if (fieldPrimero <= 10) {
                            topX.add(newLine);
                        }
                    }
                } //end of while
                reader.close();
    
                if (regTop10 == true) {
                    System.out.println("\nTop 10 Players: ");
                    for (String topXElem : topX) {
                        System.out.println(topXElem);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    public void biggestMovesTopPlyrs(int biggestMoves, int NumOfPlyrs) {

                //these are for big moves 
                int topList1 = biggestMoves;
                int topNumOfPlyrs1 = NumOfPlyrs;
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(fileName));
                    String line;
                    int findMove = 0;
                    String s1 = "";
                    ArrayList<String> arrList1 = new ArrayList<>();
                    ArrayList<String> field1List = new ArrayList<>();
                    while ((line = reader.readLine()) != null) {
                        String newLine = line.replaceAll("\"", "");
                        String[] field = newLine.split(",");
                        if (field[1].contains("Move")) {
                            continue;
                        }
                        //only interested in top 100 players
                        // - convert field[0] to integer before looping thru
                        int fieldZero = Integer.parseInt(field[0]);
                        // field[0] is less than 100 add the value to new array list
                        if (fieldZero <= topNumOfPlyrs1) {
                            arrList1.add(newLine);
                            field1List.add(field[1]);
                        }
                         
                        int fieldOne = Integer.parseInt(field[1]);
                        int fieldOneAbs = Math.abs(fieldOne);
                        if (fieldOneAbs > findMove) {
                            findMove = fieldOneAbs;
                            s1 = newLine;
                        } 
                        
                    } //end of while
                    reader.close();
        
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
                        moveIndexTracker.add(maxIndex);
                        field1IntList.set(maxIndex, 0);
                    }
                    System.out.println("\nTop " + topList1 + " biggest moves out of the top " + topNumOfPlyrs1 + " players:");
                    for (int eachEl : moveIndexTracker) {
                        System.out.println(arrList1.get(eachEl));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


}


