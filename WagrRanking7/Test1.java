// import java.io.BufferedReader;
// import java.io.FileNotFoundException;
// import java.io.FileReader;
// import java.io.IOException;
// import java.lang.reflect.Array;
// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.Collections;

// public class Test1 {
//     public static void main(String[] args) {
//         String fileName = "WagrRanking8:6.csv";
//         //these are for big moves 
//         int topList = 20;
//         int topNumOfPlyrs = 250;

//         String[] favoritePlayers = {"Connor Willi", "Mahant", "Luke Potter", "Pongsap"};

//         //these are for regular top 10
//         boolean regTop10 = true;

//         //find one particular player
//         String onePlyrName = "Connor";

        
//         System.out.println();
//         try {
//             BufferedReader reader = new BufferedReader(new FileReader(fileName));
//             String line;
//             int findMove = 0;
//             String s1 = "";
//             String onePlyr = "";

//             ArrayList<String> topX = new ArrayList<>();
//             ArrayList<String> arrList1 = new ArrayList<>();
//             ArrayList<String> field1List = new ArrayList<>();
//             ArrayList<String> nameList = new ArrayList<>();
//             ArrayList<String> cleanLook = new ArrayList<>();
//             ArrayList<String> favPlyrsArrList = new ArrayList<>();

//             while ((line = reader.readLine()) != null) {
//                 String newLine = line.replaceAll("\"", "");
//                 String[] field = newLine.split(",");
//                 if (field[1].contains("Move")) {
//                     continue;
//                 }

//                 if (field[3].contains(onePlyrName)) {
//                     onePlyr = newLine;
//                     nameList.add(onePlyr);
//                 }

//                 int n = 1;
//                 for (String eachElem : favoritePlayers) {
//                     if (field[3].contains(eachElem)) {
//                         favPlyrsArrList.add(eachElem);
//                         System.out.println("Fav Player: " + eachElem);
//                         System.out.println(newLine);
//                     }

//                 }

//                 //only interested in top 100 players
//                 // - convert field[0] to integer before looping thru
//                 int fieldZero = Integer.parseInt(field[0]);
//                 // field[0] is less than 100 add the value to new array list
//                 if (fieldZero <= topNumOfPlyrs) {
//                     arrList1.add(newLine);
//                     field1List.add(field[1]);
//                 }
                 
//                 int fieldOne = Integer.parseInt(field[1]);
//                 int fieldOneAbs = Math.abs(fieldOne);
//                 if (fieldOneAbs > findMove) {
//                     findMove = fieldOneAbs;
//                     s1 = newLine;
//                 } 

//                 // //find by country
//                 // if (field[2].contains("Thailand")) {
//                 //     System.out.println(newLine);
//                 // }                
                

//                 //top 10 rank
//                 if (regTop10 == true) {
//                     int fieldPrimero = Integer.parseInt(field[0]);
//                     if (fieldPrimero <= 10) {
//                         topX.add(newLine);
//                     }
//                 }

                
//             } //end of while
//             reader.close();
//             // System.out.println(findMove);
//             // System.out.println(s1);
//             // arrList1.remove(0);
//             // field1List.remove(0);
//             // System.out.println(arrList1);
//             // System.out.println(field1List);
//             System.out.println();
//             System.out.println("List that contains " + onePlyrName + ": "  + nameList);

//             //making each element in field1List to be an integer and abosulute
//             ArrayList<Integer> field1IntList = new ArrayList<>();
//             for (String eachElem : field1List) {
//                 // make integer
//                 int eachElemInt = Integer.parseInt(eachElem);
//                 //abs value
//                 int eachElemIntAbs = Math.abs(eachElemInt);
//                 field1IntList.add(eachElemIntAbs);
//             }
            
//             ArrayList<Integer> moveIndexTracker = new ArrayList<>();
//             for (int i = 1; i <= topList; i++) {
//                 //finding the max element
//                 int maxMove = Collections.max(field1IntList);
//                 //finding the index of max element
//                 int maxIndex = field1IntList.indexOf(maxMove);
//                 //add index to the tracker
//                 moveIndexTracker.add(maxIndex);
//                 field1IntList.set(maxIndex, 0);
//             }

//             // System.out.println(moveIndexTracker);

//             System.out.println("\nOne particular player:");
//             System.out.println(onePlyr);

//             System.out.println("\nTop " + topList + " biggest moves out of the top " + topNumOfPlyrs + " players:");
//             for (int eachEl : moveIndexTracker) {
//                 System.out.println(arrList1.get(eachEl));
//             }

//             if (regTop10 == true) {
//                 System.out.println("\nTop 10 Players: ");
//                 for (String topXElem : topX) {
//                     System.out.println(topXElem);
//                 }
//             }

//             // System.out.println(cleanLook.get(3));
            

            


//             // System.out.println(field1IntList);


//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     } // end of main

//     public void topX(ArrayList<String> daTopX) {
//         for (String topXElem : daTopX) {
//             System.out.println(topXElem);
//         }

        
//     }




// }

