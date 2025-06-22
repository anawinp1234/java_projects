
import java.util.Scanner;

public class AppChoice {
    public static void main(String[] args) {
       WagrFileIO objIO = new WagrFileIO("WagrRanking8:7.csv"); 
        Scanner input = new Scanner(System.in);
        Scanner name = new Scanner(System.in);
        Scanner namesArr = new Scanner(System.in);
        Scanner topMove = new Scanner(System.in);
        Scanner topRank = new Scanner(System.in);
        String[] favoritePlayers = {"Connor Williams", "Mahanth", "Luke Potter", "Pongsapak"};
        boolean inputCondition = true;
        System.out.println("1. Find one particular player: \n2. List of favorite players: \n3. Top Ten: \n4. Biggest Moves: \n5. Quit");
            while (inputCondition) {

                System.out.print("Choose a number or quit: ");
                switch (input.nextLine()) {
                    case "1":
                    System.out.print("Enter name of player: ");
                    objIO.findOnePlyr(name.nextLine());
                    System.out.println();
                    break;
                    
                    case "2":
                    objIO.favPlayersMeth(favoritePlayers);
                    System.out.println();
                    break;
                    
                    case "3":
                    objIO.topTen(true);
                    System.out.println();
                    break;
                    
                    case "4":
                    System.out.print("Please enter the top Moves: ");
                    int tm = topMove.nextInt();
                    System.out.print("Please enter number of top players: ");
                    int tr = topRank.nextInt();
                    objIO.biggestMovesTopPlyrs(tm, tr);
                    System.out.println();
                    break;

                    case "5":
                    System.out.println("Bye...");
                    inputCondition = false;
                    break;

                    default:
                    System.out.println("Please choose again");
                    break;
                }
            }
            input.close();
            name.close();
            namesArr.close();
            topMove.close();
            topRank.close();
        }
        
    }