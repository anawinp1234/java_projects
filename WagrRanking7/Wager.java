public class Wager {
    // private String fileName;
    private ArrayList<String> arrListofLines = new ArrayList<>();

    public Wager(String fn) {
        // fn is file name
        BufferedReader reader = new BufferedReader(new FileReader(fn));
        String line;
        while ((line = reader.readLine()) != null) {
            String newLine = line.replaceAll("\"", "");
            if (line.contains("Move")) {
                continue;
            }
            arrListofLines.add(newLine);
        }
        reader.close();
    }

    
    public ArrayList getArrLofLines() {
        return arrListofLines;
    }


    public void favPlayersMeth(String[] favoritePlayers1) {
        ArrayList<String> favPlyrsArrList = new ArrayList<>();
        String[] favoritePlayersArr = favoritePlayers1;
        // loop
        for (String eachLine : arrListofLines) {
            String[] fields = eachLine.split(",");
            for (String eachPlayer : favoritePlayers1) {
                    if (field[3].contains(eachPlayer)) {
                        favPlyrsArrList.add(eachPlayer);
                    }
            }
        }
        return favoritePlfavPlyrsArrList;       
    } 

        



            while ((line = reader.readLine()) != null) {
                String newLine = line.replaceAll("\"", "");
                if (field[1].contains("Move")) {
                    continue;
                }
                for (String eachPlayer : favoritePlayersArr) {
                }
            } //end of while
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList favPlayersMeth(String[] favoritePlayers1) {
            ArrayList<String> printOuts = new ArrayList<>(); 
            String fileName = "WagrRanking8:6.csv";
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
                            printOuts.add("Fav Player: " + eachElem);
                            printOuts.add(newLine);
                        }
                    }
                } //end of while
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            
            return printOuts;
        }





}








